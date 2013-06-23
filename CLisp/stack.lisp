;;;REG NO:JYAKECS035
;;;EXP NO:18
;;;EXP NAME: ADT STACK

(defun pusha(stack)
(print "Enter element to be pushed:")
(cons (read) stack))

(defun popa(stack)
(if (not (null stack))
(remove (first stack) stack)))

(defun stack()
(setf mystack nil)
(setf n 10)
(dotimes (i n)
(print "1:PUSH 2:POP 3:EXIT")
(print "Enter choice:")
(setf c (read))
(if(= c 1) (setf mystack (pusha mystack)))
(if(= c 2) (setf mystack (popa mystack)))
(if(= c 3) return)
(print mystack)
))

OUTPUT
*************************
[1]> (load "stack.lisp")
;; Loading file stack.lisp ...
;; Loaded file stack.lisp
T
[2]> (stack)

"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 1

"Enter element to be pushed:" 1

(1) 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 1

"Enter element to be pushed:" 2

(2 1) 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 1

"Enter element to be pushed:" 3

(3 2 1) 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 2

(2 1) 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 2

(1) 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 2

NIL 
"1:PUSH 2:POP 3:EXIT" 
"Enter choice:" 3
