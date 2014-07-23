(ns commons.util.date
  (:import [java.util.Date]
           [java.text.SimpleDateFormat]))

(def date-format-str "yyyy-MM-dd HH:mm:ss")

(defn format-date
  [date]
  (let [df (java.text.SimpleDateFormat. date-format-str)]
    (.format df date)))

(defn get-time-by-sec
  [sec]
  (let [milli (* sec 1000)]
    (format-date (java.util.Date. milli))))
