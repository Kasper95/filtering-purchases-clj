(ns filtering-purchases-clj.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main []
  (let [purchases (slurp "purchases.csv")
        purchases (str/split-lines purchases)

        ; goes over each line and split by commas.
        ; makes the lines be vectors containing a separate string for each column
        purchases (map (fn [line]
                         (str/split line #","))
                       purchases)
        ]
              purchases))
