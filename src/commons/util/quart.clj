(ns commons.quart
  (:require
   [clojurewerkz.quartzite.scheduler :as qs]
   [clojurewerkz.quartzite.jobs :refer [defjob]]
   [clojurewerkz.quartzite.jobs :as j]
   [clojurewerkz.quartzite.triggers :as t]
   [clojurewerkz.quartzite.schedule.simple :refer [schedule with-repeat-count with-interval-in-milliseconds]]))

(defmacro def-job
  [name & body]
  `(defrecord ~name
       []
     org.quartz.Job
     (execute [this ctx]
       ~@body)))

(defn build-job [type key]
  (j/build
   (j/of-type type)
   (j/with-identity key)))

(defn build-trigger
  [key schedule]
  (t/build
   (t/with-identity key)
   (t/start-now)
   (t/with-schedule schedule)))
