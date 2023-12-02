(ns advent-of-code-2023.day2.common
  (:require [clojure.string :as str]))

(defn parse-color-raw [color-raw]
  (let [[amount-raw color] (str/split color-raw #" ")
        amount (Integer/parseInt amount-raw)]
    [(keyword color) amount]))

(defn parse-round [round-raw]
  (let [default-round {:blue 0 :red 0 :green 0}
        by-color-raw (str/split round-raw #", ")
        parsed-colors (mapv parse-color-raw by-color-raw)]
    (into
      {:blue 0 :red 0 :green 0}
      parsed-colors)))

(defn parse-game-data [game-data-raw]
  (let [[round-info rounds-raw] (str/split game-data-raw #": ")
        game-id (Integer/parseInt (str/replace round-info #"Game " ""))
        rounds (mapv parse-round (str/split rounds-raw #"; "))]
    {:id game-id :rounds rounds}))
