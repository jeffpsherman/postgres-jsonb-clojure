(ns postgres-jsonb-clojure.core
   (:require [clojure.java.jdbc :as sql]
             [cheshire.core :as json]
             [postgre-types.json :refer [add-json-type add-jsonb-type]]
             )
  )

(add-json-type json/generate-string json/parse-string)
(add-jsonb-type json/generate-string json/parse-string)

(def postgres-db {:subprotocol "postgresql"
               :subname "//localhost:5432/database"
               :user "user"
               :password "password"})


(defn create-table []
  "Create the example table"
  (sql/db-do-commands postgres-db
              (sql/create-table-ddl :example [:fields :jsonb]))
  )

(defn insert-json [data]
  "Insert the data as jsonb"
    (sql/insert! postgres-db :example {:fields data})
)

(defn select-guid []
  "Select the guid from the json data"
  (println "GUID from file = " (sql/query postgres-db ["select fields->>'GUID' as GUID from example"]
             :row-fn :guid))
  )

(defn -main
  "Read a file, convert to json"
  [x]
  (let [fileData (json/parse-stream (clojure.java.io/reader x) true)]
    (create-table)
    (insert-json fileData)
    (select-guid)
    )
)

