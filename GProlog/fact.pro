%%REG NO:JYAKECS035
%%EXP NO:20
%%EXP NAME:FACTORIAL

fact(0,1).
fact(N,R):- N>0, N1 is N-1, fact(N1,R1), R is N*R1.

OUTPUT:
*******************
s5cse35@pe3:~$ jpl fact.pro
 Jyothi Prolog Compiler 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- halt.
s5cse35@pe3:~$ ./fact.pro.jpl 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- fact(4,X).

X = 24 ? 

yes
| ?- fact(5,T).

T = 120 ? 
