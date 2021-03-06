(defproject conman "0.6.3"
  :description "a database connection management library"
  :url "https://github.com/luminus-framework/conman"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.layerware/hugsql "0.4.7"]
                 [com.carouselapps/to-jdbc-uri "0.5.0"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [hikari-cp "1.7.5"]]
  :profiles
  {:dev
   {:dependencies [[com.h2database/h2 "1.4.191"]]}})
