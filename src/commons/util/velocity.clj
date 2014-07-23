(ns commons.util.velocity
  (:use [ring.velocity.core :only [render]]))

(defn stringify-map
  [m]
  (zipmap (map name (keys m)) (vals m)))

(defn transfrom-kvs [kvs]
  (cond (map? kvs) (stringify-map kvs)
        (or (seq? kvs)  (vector? kvs)) (map transfrom-kvs kvs)
        :else kvs))

(defn render-tpl [tpl & kvs]
  (apply render tpl (map transfrom-kvs kvs)))
