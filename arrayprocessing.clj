;; arrayprocessing.clj creates, modifies, and prints an array
;; Lorrayya Williams
;; March 11, 2019 for CS 214
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;;names the program
(ns arrayprocessing)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; readArray() adds user inputed numbers to the array
;;; Receive: anArray, a size.
;;; Return: The modifiied list.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn readArray[anArray size]
  (loop [i 0]
    (when (< i size)
      (print "Add a value to your array. ") (flush)
      (let
        [value (double (read))]
        (aset-double anArray i value)
        (recur (+ i 1))
      )
    )
  ) anArray
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; printArray() prints the Array
;;; Receive: anArray, size.
;;; Return: the numbers in the array to the screen by printing them
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn printArray[anArray size]
  (loop [i 0]
    (when (< i size)
        (printf "%f\n" (aget anArray i)) (flush)
        (recur (+ i 1))
      )
    )
  )


  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
  ;;; Function -main() test-drives the readArray() and printArray() functions.
  ;;; Input: Size of Array.
  ;;; Output: The Array via printArray()
  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
  (println "Welcome! This programs allows you to create an Array, add values, and prints them.")
  (println "What size would you like your Array? ") (flush)
  (let
    [size  (int(read))
    anArray (double-array size)
    ]
    (readArray anArray size)
    (printArray anArray size)
  )
  )
