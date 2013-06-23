%%REG NO:JYAKECS035
%%EXP NO:23
%%EXP NAME:GCD OF 2 NUMBERS

gcd(M,N,G):- N>M, gcd(N,M,G).
gcd(M,0,M).
gcd(M,N,G):- N>0, R is M mod N, gcd(N,R,G).

OUTPUT:
*********************
s5cse35@pe3:~$ jpl gcd.pro
 Jyothi Prolog Compiler 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- halt.
s5cse35@pe3:~$ ./gcd.pro.jpl 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- gcd(10,15,M).

M = 5 ? 

yes
| ?- gcd(18,12,M).

M = 6 ?
