(ns advent-of-code-2023.day3.common
  (:require [advent-of-code-2023.lib.string-number-conversions :refer [char-to-int]]))

(defn handle-character [numbers prev-was-number character column row]
  (let [char-as-int (char-to-int character)
        char-is-int (number? char-as-int)
        without-latest-number (subvec numbers 0 (max 0 (dec (count numbers))))
        latest-number (get numbers (dec (count numbers)))]
    (cond
      (and prev-was-number char-is-int)
      (conj
        without-latest-number
        (assoc
          latest-number
          :number (Integer/parseInt (str (:number latest-number) character))
          :end column))
      
      char-is-int
      (conj numbers {:number char-as-int
                     :start column
                     :end column
                     :row row})
      
      :else numbers)))

(defn find-numbers [schematic-line row]
  (loop [numbers []
         prev-was-number false
         remaining-characters schematic-line
         column 0]
    (if (= 0 (count remaining-characters))
      numbers
      (recur
        (handle-character
          numbers
          prev-was-number
          (get remaining-characters 0)
          column
          row)
        (number? (char-to-int (get remaining-characters 0)))
        (subs remaining-characters 1)
        (inc column)))))

(defn is-symbol [character]
  (and (not (number? (char-to-int character)))
       (not= \. character)))

(defn find-symbols [schematic-line row]
  (loop [symbols []
         remaining-characters schematic-line
         column 0]
    (if (= 0 (count remaining-characters))
      symbols
      (let [character (get remaining-characters 0)
            is-symbol (is-symbol character)]
        (recur
          (if is-symbol
            (conj symbols {:char character :row row :column column})
            symbols)
          (subs remaining-characters 1)
          (inc column))))))

(defn parse-engine-data [schematic]
  (loop [numbers []
        symbols []
        remaining-schematic schematic
        row 0]
    (if (= 0 (count remaining-schematic))
      {:numbers numbers :symbols symbols}
      (let [schematic-line (get remaining-schematic 0)]
        (recur
          (into [] (concat numbers (find-numbers schematic-line row)))
          (into [] (concat symbols (find-symbols schematic-line row)))
          (subvec remaining-schematic 1)
          (inc row))))))
