(ns shorturl-service.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.handler.dump :refer [handle-dump]]
            [ring.util.response :refer [redirect]]
            ))


;;(def mock-request
;;	{: params "value"})

(def url-map (atom
  {"jrock" "http://jr0cket.co.uk"
   "bbc" "http://news.bbc.co.uk"
   "teleg" "http://www.telegraph.co.uk"
  }))

;;Redirect 
(defn redirect-fullurl
	[request]
	(if-let [fullurl (get @url-map (get-in request [:params :redirect-url]))]
	(redirect fullurl)
	;;handle-dump
	(route/not-found "Unknown shortcode")))

(defn server
	[request]
	(str "Server is " (get request :server-name)))

(defn handle-form [request]
  (let [ short-url (:short-url (request :params))
         full-url (:full-url (request :params))
       ]
    (swap! url-map assoc short-url full-url)
    (format "<p>Created short url <a href=\"/%s\">%s</a> for %s</p><h2>Current URL CODES</h2>%s" 
      short-url short-url full-url @url-map)))


(defroutes app-routes
  (route/resources "/")
  (GET "/" [] (redirect "index.html"))
  (POST "/url-form/submit" [] handle-form)
  ;;(GET "/" [] "Hello World")
  (GET "/message" [] "Ping pong")
  (GET "/server" [] server)
  (GET "/dump" [] handle-dump)
  (GET "/submit" [] handle-form)
  ;;(GET "/:redirect" [params] (redirect-fullurl (get request :redirect)))
  (GET "/:redirect-url" [] redirect-fullurl)
  (route/not-found "Not Found"))


; Disable anti forgery check
; http://practicalli.github.io/clojure-webapps/project-url-shortner/disable-anti-forgery-check.html

(def app 
  (wrap-defaults 
  app-routes 
  (assoc-in site-defaults [:security :anti-forgery] false)))