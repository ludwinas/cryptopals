(ns com.ludwinas.cryptopals.util
  (:require [clojure.string :as str])
  (:import org.apache.commons.codec.binary.Hex
           java.util.Base64
           java.util.Base64$Encoder
           java.util.Base64$Decoder))

(defn str->bytes
  "Convert UTF-8 string to byte array"
  [^String s]
  (.getBytes s "UTF-8"))

(defn bytes->str
  "Convert byte array to String"
  [^bytes data]
  (String. data "UTF-8"))

(defn hex->bytes
  "Convert hexadecimal encoded string to bytes array"
  [^String data]
  (Hex/decodeHex (.toCharArray data)))

(defn bytes->hex
  "Convert a byte array to hex encoded string"
  [^bytes data]
  (Hex/encodeHexString data))

(defn bytes->b64-str
  "Encode data to base64 string format"
  [^bytes data]
  (let [^Base64$Encoder encoder (java.util.Base64/getEncoder)]
    (.encodeToString encoder data)))

(defn xor
  "XOR two sequences of bits against each other"
  [x y]
  (mapv bit-xor x y))
