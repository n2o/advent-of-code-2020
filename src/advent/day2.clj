(ns advent.day2
  (:require [clojure.string :as string]
            [advent.lib :as lib]))

(def input (lib/read-multiline-file-no-eval "day2"))

(defn valid-password? [sample]
  (let [[times char password] (string/split sample #" ")
        [min max] (string/split times #"-")
        min' (Integer/parseInt min)
        max' (Integer/parseInt max)
        char' (first (drop-last char))
        current (get (frequencies password) char')]
    (when current
      (<= min' current max'))))

(def part1
  (count
    (filter valid-password? input)))
