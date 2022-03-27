(ns com.ludwinas.cryptopals.set-1
  (:require [com.ludwinas.cryptopals.util :as u]))

(defn fixed-xor
  [string-1 string-2]
  (let [bytes-1 (u/hex->bytes string-1)
        bytes-2 (u/hex->bytes string-2)]
    (->> (u/xor bytes-1 bytes-2)
         (byte-array)
         (u/bytes->hex))))

(defn hex-to-base-64
  [input]
  (-> (u/hex->bytes input)
      (u/bytes->b64-str)))
