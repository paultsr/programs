;;;REG NO:JYAKECS035
;;;EXP NO:14
;;;EXP NAME:FIBONACCI SERIES

(defun fib()
(print "Enter limit")
(setf n (read))
(setf a 0)
(setf b 1)
(print "Series is")
(if(= n 1)
(print a))
(cond((> n 1)
(print a)
(print b)
(dotimes(i (- n 2))
(setf s (+ a b))
(print s)
(setf a b)
(setf b s)))))

OUTPUT:
****************
 [3]> (load "fib.lisp")
;; Loading file fib.lisp ...
;; Loaded file fib.lisp
T
Break 1 [3]> (fib)

"Enter limit" 6

"Series is" 
0 
1 
1 
2 
3 
5 
NIL
Break 1 [3]> 
