(defproject commons "0.1.0-SNAPSHOT"
  :description "FIXME: lzwjava personal util library"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clojurewerkz/quartzite "1.1.0"]
                 [http-kit "2.1.18"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/tools.trace "0.7.8"]
                 [troncle "0.1.2-SNAPSHOT"]
                 [ring.velocity "0.1.2"]
                 [enlive "1.1.5"]]
  :resource-paths ["resources"]
  :repositories {"local" ~(str (.toURI (java.io.File. ".")))})
