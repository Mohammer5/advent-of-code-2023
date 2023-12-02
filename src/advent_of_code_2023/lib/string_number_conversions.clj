(ns advent-of-code-2023.lib.string-number-conversions
  (:require [clojure.string :as str]))

(defn char-to-int [character]
  (try
    (Integer/parseInt (str character))
    (catch Exception e nil)))
