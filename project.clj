(defproject postgres-jsonb-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 ;;This is a project that extends standard jdbc to support json/jsonb
                 [postgre-types "0.0.4"]
                 [cheshire "5.4.0"]
                 ]
  :main postgres-jsonb-clojure.core
  )
