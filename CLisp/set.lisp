;;;REG NO:JYAKECS035
;;;EXP NO:19
;;;NAME:SET OPERATIONS

(defun uni(s1 s2)
(cond ((null s1)s2)
((null s2)s1)
((membera(car s1)s2)(uni (cdr s1)s2))
(t (append(list (car s1))(uni (cdr s1)s2)))))

(defun membera(a l)
(if (null l)nil (if(equal a(car l)) T (membera a (cdr l)))))

(defun inter(s1 s2)
(cond ((null s1)nil)
((null s2)nil)
((membera(car s1)s2)(append (list(car s1))
(inter(cdr s1)s2)))
(t (inter (cdr s1)s2))))

(defun diff(s1 s2)
(cond ((null s1)nil)
((null s2)s1)
((membera(car s1)s2)(diff (cdr s1)s2))
(t (append(list (car s1))(diff (cdr s1)s2)))))


OUTPUT:
**************
1 [2]> (load "set.lisp")
;;  Loading file set.lisp ...
;;  Loaded file set.lisp
T
Break 1 [2]> (uni '(1 2) '(3 2 4))
(1 3 2 4)
Break 1 [2]> (inter '(1 2) '(3 2 4))
(2)
Break 1 [2]> (diff '(1 2) '(3 2 4))
(1)
Break 1 [2]> (membera 2 '(3 2 4))
T
Break 1 [2]> (membera 1 '(3 2 4))
NIL
