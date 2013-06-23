%%REG NO:JYAKECS035
%%EXP NO:22
%%EXP NAME:LIST REVERSAL

rev([],[]).
rev([H|T],R):- rev(T,R1),append(R1,[H],R).

OUTPUT:
***********************
s5cse35@pe3:~$ jpl rev.pro
 Jyothi Prolog Compiler 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- halt.
s5cse35@pe3:~$ ./rev.pro.jpl 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- rev([a,b,c,d],R).

R = [d,c,b,a]

yes
