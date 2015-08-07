(ns rotateam.core)

(defn swap-role [role team]
  (assoc role :filling [(second (:filling role))
                        (first (:filling role))]))
