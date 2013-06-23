;;;REG NO:JYAKECS035
;;;EXP NO:16
;;;EXP NAME:BUBBLE SORT

(defun sorta()
(print "Enter limit")
(setf n (read))
(setf a (make-array n))
(print "Enter elements")
(dotimes (i n)
(setf (aref a i) (read)))
(dotimes (i n)
(dotimes (j (- (- n i) 1))
(cond((> (aref a j) (aref a (+ j 1)))
(setf temp (aref a j))
(setf (aref a j) (aref a (+ j 1)))
(setf (aref a (+ j 1)) temp)))))
(print "Sorted list")
(dotimes (i n)
(print (aref a i))))


OUTPUT:
***********************
Break 23 [24]> (load "sort.lisp")
;;     Loading file sort.lisp ...
;;     Loaded file sort.lisp
T
Break 23 [24]> (sorta)

"Enter limit" 5

"Enter elements" 5 6 3 8 2

"Sorted list" 
2 
3 
5 
6 
8 
