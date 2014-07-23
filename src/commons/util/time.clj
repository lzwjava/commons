(ns commons.util.time)

(defn currentTimeSecs []
  (int (/ (System/currentTimeMillis) 1000)))
