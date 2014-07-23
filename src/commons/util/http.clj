(ns commons.util.http
  (:require
   [org.httpkit.client :as http]))

(defn get-cookie-options
  [cookie]
  {:headers {"Cookie" cookie}})

(defn http-get-with-cookie
  [url cookie]
  (http/get url (get-cookie-options cookie)))
