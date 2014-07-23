(ns commons.core
  (:use (commons quart-util http-util)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
