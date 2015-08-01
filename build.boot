(set-env!
 :resource-paths #{"src" "resources"}
 :dependencies '[[org.clojure/clojure     "1.7.0" :scope "provided"]
                 [radicalzephyr/bootlaces "0.1.12"]])

(require '[radicalzephyr.bootlaces :refer :all])

(def +version+ "0.2.1-SNAPSHOT")

(bootlaces! +version+)

(task-options!
 pom  {:project     'rotateam
       :version     +version+
       :description "Track team role rotations"
       :url         "https://github.com/radicalzephyr/rotateam-clj"
       :scm         {:url "https://github.com/radicalzephyr/rotateam-clj"}
       :license     {"Eclipse Public License"
                     "http://www.eclipse.org/legal/epl-v10.html"}})