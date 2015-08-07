(ns rotateam.core-test
  (:require [rotateam.core :refer :all]
            [clojure.test :refer :all]))


(deftest next-filler
  (let [team-a  (team [{:name "John"} {:name "Mary"}])
        foreman {:title "Foreman" :filling team-a}]
    (is (= {:title "Foreman" :filling '({:name "Mary"} {:name "John"})}
           (swap-role foreman team-a))))

  (let [team-a  (team [{:name "John"} {:name "Mary"} {:name "Bruce"}])
        foreman {:title "Foreman" :filling team-a}]
    (is (= {:title "Foreman" :filling '({:name "Mary"} {:name "Bruce"} {:name "John"})}
           (swap-role foreman team-a)))))
