(ns advent-of-code-2023.day3.exercise1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day3.exercise1 :refer [exercise1]]))

(def example-input ["467..114.."
                    "...*......"
                    "..35..633."
                    "......#..."
                    "617*......"
                    ".....+.58."
                    "..592....."
                    "......755."
                    "...$.*...."
                    ".664.598.."])

(deftest example
  (testing "Example input"
    (let [actual   (exercise1 example-input)
          expected 4361]
      (is (= actual expected)))))
