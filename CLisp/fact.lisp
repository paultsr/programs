;;;REG NO: JYAKECS035
;;;EXP NO:13
;;;EXP NAME: FACORIAL

(defun fact()
(print "Enter the no:")
(setf n (read))
(setf s 1)
(print "Factorial is:")
(if(= n 0)
(print 1))
(cond((> n 0)
(dotimes(i n)
(setf s (* s (+ i 1))))))
(print s))


OUTPUT:
***************
[13]> (load "fact.lisp")
;; Loading file fact.lisp ...
;; Loaded file fact.lisp
T
Break 11 [13]> (fact)

"Enter the no:" 4

"Factorial is:" 
24 
