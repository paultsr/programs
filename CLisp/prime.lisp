;;;REG NO:JYAKECS035
;;;EXP NO:15
;;;EXP NAME:PRIME OR NOT

(defun prime()
(print "Enter element")
(setf n (read))
(if(or (= n 0) (= n 1))
(print "Neither prime nor composite"))
(cond((> n 1)
(setf c 0)
(dotimes(i (- n 2))
(setf a (mod n (+ i 2)))
(if(= a 0)
(setf c (+ c 1))))
(if(= c 0)
(print "Number is prime")
(print "Number not prime")))))

OUTPUT:
****************
[4]> (load "prime.lisp")
;; Loading file prime.lisp ...
;; Loaded file prime.lisp
T
Break 2 [4]> (prime)

"Enter element" 4

"Number not prime" 
