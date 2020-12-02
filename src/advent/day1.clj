(ns advent.day1
  (:require [advent.lib :as lib]))

(def sample [1721 979 366 299 675 1456])
(def input (sort (lib/read-multiline-file "day1")))

(defn find-product [l]
  (first
    (for [x l
          y l
          z l
          :when (= 2020 (+ x y z))]
      (* x y z))))

(time
  (find-product input))