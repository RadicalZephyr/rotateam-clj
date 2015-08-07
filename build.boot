(set-env!
 :resource-paths #{"src" "resources" "test"}
 :dependencies '[[org.clojure/clojure     "1.7.0" :scope "provided"]
                 [adzerk/boot-test        "1.0.4" :scope "test"]
                 [radicalzephyr/bootlaces "0.1.15-SNAPSHOT"  :scope "test"]])

(require '[radicalzephyr.bootlaces :refer :all]
         '[adzerk.boot-test :refer :all])

#_(merge-env!
 :dependencies '[[com.datomic/datomic-pro "0.9.5206"]]
 :repositories [["my-datomic" (collect-credentials "DATOMIC_"
                                                   "https://my.datomic.com/repo")]])

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
