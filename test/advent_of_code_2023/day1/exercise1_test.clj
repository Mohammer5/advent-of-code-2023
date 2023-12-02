(ns advent-of-code-2023.day1.exercise1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1.exercise2 :refer [parse-input]]))

(def example-input ["two1nine"
                    "eightwothree"
                    "abcone2threexyz"
                    "xtwone3four"
                    "4nineeightseven2"
                    "zoneight234"
                    "7pqrstsixteen"])

(deftest example
  (testing "Example input"
    (let [actual   (parse-input example-input)
          expected 281]
      (is (= actual expected)))))
