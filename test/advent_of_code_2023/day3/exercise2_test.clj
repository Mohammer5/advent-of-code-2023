(ns advent-of-code-2023.day3.exercise2-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day3.exercise2 :refer [exercise2]]))

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
    (let [actual   (exercise2 example-input)
          expected 467835]
      (is (= actual expected)))))
