# Meet up Clojures Group
http://www.meetup.com/London-Clojurians/events/232055224/
https://gist.github.com/jr0cket/c85e110df7d9a15a0b517c0b70733a12

# name_generator

Tatler Sloane Name generator

http://www.tatler.com/news/articles/july-2015/sloane-name-generator

http://practicalli.github.io/clojure/


## Usage

lein repl
nREPL server started on port 46611 on host 127.0.0.1 - nrepl://127.0.0.1:46611
REPL-y 0.3.7, nREPL 0.2.12
Clojure 1.8.0
Java HotSpot(TM) 64-Bit Server VM 1.8.0_66-b17
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=> (use 'name-generator.core :reload)
nil
user=> (my-posh-name "Roger Packering")
"Ratty Ponsonby Arbuthnot"
user=> 

## Fullnames 


Names
(def sloane-first-name
  {"a" ["Ally-Pally"
   "b" "Bongo"
   "c" "Chippers"
   "d" "Dingo"
   "e" "Eddy"
   "f" "Flappy"
   "g" "Gussy"
   "h" "Henners"
   "i" "Indy"
   "j" "Jolly"
   "k" "Knobber"
   "l" "L-dog"
   "m" "Muffy"
   "n" "Noddy"
   "o" "Olly"
   "p" "Piggers"
   "q" "Quicky"
   "r" "Ratty"
   "s" "Smelly"
   "t" "Tinks"
   "u" "Uggers"
   "v" "Vadge"
   "w" "Wiffy"
   "x" "Xan-Xan"
   "y" "Yum"
   "z" "Zippy"})

(def sloane-second-name
  {"a" "Anstruther"
   "b" "Beaufort"
   "c" "Cholmondeley"
   "d" "De Lisle"
   "e" "Enniskillen"
   "f" "Featherstonehaugh"
   "g" "Gladstone"
   "h" "Hereford"
   "i" "Innes"
   "j" "Jarvis"
   "k" "Keppel"
   "l" "Legge"
   "m" "Mountbatten"
   "n" "Naseby"
   "o" "Onslow"
   "p" "Ponsonby"
   "q" "Quim"
   "r" "Runciman"
   "s" "Spiffington"
   "t" "Talbot"
   "u" "Uppingham"
   "v" "Vane"
   "w" "Wodehouse"
   "x" "Xavier"
   "y" "Yarborough"
   "z" "Zermatt"})

(def sloane-third-name
  {"a" "Arbuthnot"
   "b" "Battenburg"
   "c" "Coutts"
   "d" "Drummond"
   "e" "Eden"
   "f" "Finknottle"
   "g" "Glenconner"
   "h" "Home"
   "i" "Ingleby"
   "j" "Janner"
   "k" "Knollys"
   "l" "Lambton"
   "m" "Molyneux"
   "n" "Newburgh"
   "o" "Oppenheimer"
   "p" "Percy"
   "q" "Queensberry"
   "r" "Redesdale"
   "s" "Smythe"
   "t" "Tollemache"
   "u" "Ullswater"
   "v" "Villiers"
   "w" "Wellesley"
   "x" "Xerxes"
   "y" "Yorke"
   "z" "Zakynthos"})
FIXME

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
