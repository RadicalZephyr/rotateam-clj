(ns rotateam.core)

(defn team [members]
  (into clojure.lang.PersistentQueue/EMPTY members))

(defn swap-role [role team]
  (update-in role [:filling] (fn [q]
                               (conj (pop q) (peek q)))))
