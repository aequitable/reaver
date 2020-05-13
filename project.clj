(defproject reaver "0.1.4-aequitable-SNAPSHOT"
  :description "Extract data from HTML with Clojure."
  :url "https://github.com/mischov/reaver"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.jsoup/jsoup "1.12.1"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [criterium "0.4.3"]]
                   :warn-on-reflection true}})
