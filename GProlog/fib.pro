%%REG NO:JYAKECS035
%%EXP NO:21
%%EXP NAME:FIBONACCI TERM

fib(0,0).
fib(1,1).
fib(N,F):-N>1,N1 is N-1, N2 is N1-1,fib(N1,F1),fib(N2,F2),F is F1+F2.

OUTPUT:
**********************
s5cse35@pe3:~$ jpl fib.pro
 Jyothi Prolog Compiler 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- halt.
s5cse35@pe3:~$ ./fib.pro.jpl 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- fib(6,X).

X = 8 ? 
