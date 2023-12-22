(ns advent-of-code-2023.day5.exercise1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day5.exercise1 :as day5]
            ))

(def example-input "seeds: 79 14 55 13

seed-to-soil map:
50 98 2
52 50 48

soil-to-fertilizer map:
0 15 37
37 52 2
39 0 15

fertilizer-to-water map:
49 53 8
0 11 42
42 0 7
57 7 4

water-to-light map:
88 18 7
18 25 70

light-to-temperature map:
45 77 23
81 45 19
68 64 13

temperature-to-humidity map:
0 69 1
1 0 69

humidity-to-location map:
60 56 37
56 93 4
")

(deftest day5exercise1
  ; (testing "Determine custom source value for destination value"
  ;   (let [actual (day5/get-source-by-destination 51 day5/seed-to-soil-map)
  ;         expected 99]
  ;     (is (= actual expected))))

  ; (testing "Determine default source value for destination value"
  ;   (let [actual (day5/get-source-by-destination 49 day5/seed-to-soil-map)
  ;         expected 49]
  ;     (is (= actual expected))))
  
  (testing "Parses the data"
    (let [actual (day5/parse-data example-input)]
      (println actual)
      (is (= 0 0)))))
