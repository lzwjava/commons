(ns commons.util.database)

(defn transform-row
  [res k f]
  (map (fn [row]
         (assoc row k (f (k row))))
       res))
