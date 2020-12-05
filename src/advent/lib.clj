(ns advent.lib
  (:require [clojure.java.io :as io]
            [clojure.string :as string]))

(defn read-multiline-file [file]
  (->> file
       io/resource
       slurp
       string/split-lines
       (map read-string)))

(defn read-multiline-file-no-eval [file]
  (->> file
       io/resource
       slurp
       string/split-lines))

(read-multiline-file "day1")