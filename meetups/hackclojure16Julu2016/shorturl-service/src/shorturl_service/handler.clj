(ns shorturl-service.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.handler.dump :refer [handle-dump]]
            [ring.util.response :refer [redirect]]
            ))


;;(def mock-request
;;	{: params "value"})

(def url-map
  {"jrock" "http://jr0cket.co.uk"
   "bbc" "http://news.bbc.co.uk"
   "teleg" "http://www.telegraph.co.uk"
  })

(defn redirect-fullurl
	[request]
	(if-let [fullurl (get url-map (get-in request [:params :shorturl]))]
	(redirect fullurl)
	;;handle-dump
	(route/not-found "Unknown shortcode")))

(defn server
	[request]
	(str "Server is " (get request :server-name)))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/message" [] "Ping pong")
  (GET "/server" [] server)
  (GET "/dump" [] handle-dump)
  ;;(GET "/:redirect" [params] (redirect-fullurl (get request :redirect)))
  (GET "/:shorturl" [] redirect-fullurl)
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
