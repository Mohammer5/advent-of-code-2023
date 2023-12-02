(ns advent-of-code-2023.day1.exercise2-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1.exercise2 :refer [exercise2]]))

(def example-input ["two1nine"
                    "eightwothree"
                    "abcone2threexyz"
                    "xtwone3four"
                    "4nineeightseven2"
                    "zoneight234"
                    "7pqrstsixteen"])

(deftest example
  (testing "Example input"
    (let [actual   (exercise2 example-input)
          expected 281]
      (is (= actual expected)))))
