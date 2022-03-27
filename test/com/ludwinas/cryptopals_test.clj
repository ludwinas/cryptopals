(ns com.ludwinas.cryptopals-test
  (:require [com.ludwinas.cryptopals.set-1 :as set-1]
            [clojure.test :refer [deftest is]]))

(deftest challenge-1
  (is (= (set-1/hex-to-base-64 "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d")
         "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t")))

(deftest challenge-2
  (let [input-1 "1c0111001f010100061a024b53535009181c"
        input-2 "686974207468652062756c6c277320657965"
        result "746865206b696420646f6e277420706c6179"]
    (is (= (set-1/fixed-xor input-1 input-2)
           result))))
