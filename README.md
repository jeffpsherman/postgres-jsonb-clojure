# postgres-jsonb-clojure

This is a simple example of how to read and write json/jsonb data to a postgresql database.

The gotcha is that JSON and JSONB aren't standard jdbc data types so you need to extend clojure's ISQLValues.

@siscia has a nice library here:
https://github.com/siscia/postgres-type

I thought I would put up this example to help the next dev trying to put all these pieces together.

Hope it helps!

Feedback always appreciated.

## Usage

~/lein.sh run example.json

## License

Copyright © 2015 GuaranteedRate.com

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
