(ns name-generator.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


;; list
;; vector []
;; map {}
;; set #{}

(def sloane-names
  {"a" ["Ally-Pally", "Anstruther", "Arbuthnot"]
   "b" ["Bongo", "Beufort", "Battenburg"]
   "c" ["Chippers", "Cholmondeley", "Coutts"]
   "k" ["Knobber", "Keppel", "Knollys"]
   "p" ["Piggers", "Ponsonby", "Percy"]
   "r" ["Ratty", "Runciman", "Redesdale"]
  })


(defn firstc [name] (clojure.string/lower-case (first name)))
(defn secondc [name] (clojure.string/lower-case (second name)))

(defn firstn [character]
 	(nth (sloane-names character) 0))
(defn secondn [character]
	(nth (sloane-names character) 1))
(defn thirdn [character]
	(nth (sloane-names character) 2))

(defn my-posh-name
  "Given your name, return a sloane version"
  ([myname]
   (apply my-posh-name (clojure.string/split myname #" ")))
  ([first-name last-name]
   (let [first-char (firstc first-name)
         second-char (firstc last-name)
         third-char (secondc last-name)]
     (str (firstn first-char) 
         " "
         (secondn second-char)
         " "
         (thirdn third-char)))))

  