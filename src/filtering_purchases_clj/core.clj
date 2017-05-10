(ns filtering-purchases-clj.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main []
  (let [purchases(slurp "purchases.csv")]
              purchases))
