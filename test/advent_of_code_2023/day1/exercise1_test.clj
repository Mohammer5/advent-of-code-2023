(ns advent-of-code-2023.day1.exercise1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1.exercise1 :refer [exercise1]]))

(def example-input ["1abc2"
                    "pqr3stu8vwx"
                    "a1b2c3d4e5f"
                    "treb7uchet"])

(deftest example
  (testing "Example input"
    (let [actual   (exercise1 example-input)
          expected 142]
      (is (= actual expected)))))
