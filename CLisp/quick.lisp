;;;REG NO:JYAKECS035
;;;EXP NO:17
;;;EXP NAME:QUICKSORT

(defun pivot(a)
(car (cdr a)))

(defun sorted(a)
(or (null a)(= 1 (length a))))

(defun smaller(a n)
(cond ((null a) nil)
((<(car a) n)(cons(car a)(smaller(cdr a) n)))
(t (smaller(cdr a) n))))

(defun greater(a n)
(cond ((null a) nil)
((>(car a) n)(cons(car a)(greater(cdr a) n)))
(t (greater(cdr a) n))))

(defun qsort(a)
(if(sorted a)a
(append (qsort(smaller a (pivot a)))
(list (pivot a))
(qsort (greater a (pivot a)))
)))


OUTPUT
**********************************
[1]> (load "quik.lisp")
;; Loading file quik.lisp ...
;; Loaded file quik.lisp
T
[2]> (qsort '(9 8 1 3 4))
(1 3 4 8 9)
