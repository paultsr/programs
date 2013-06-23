%%REG NO:JYAKECS035
%%EXP NO:24
%%EXP NAME:MY NFA

accept(W):-start(S),path(S,W).
path(S,[]):-final(S).
path(S,[H|T]):-arc(S,H,N),path(N,T).
start(1).
final(6).
arc(1,a,1).
arc(1,b,2).
arc(2,a,2).
arc(2,b,3).
arc(2,b,4).
arc(3,a,6).
arc(4,a,5).
arc(5,b,6).
arc(5,b,1).


OUTPUT:
*************************
s5cse35@pe3:~$ jpl nfa.pro
 Jyothi Prolog Compiler 
GNU Prolog 1.3.0
By Daniel Diaz
Copyright (C) 1999-2007 Daniel Diaz
| ?- halt.
s5cse35@pe3:~$./nfa.pro.jpl

| ?- accept([b,b,a])
.

true ? 
Action (; for next solution, a for all solutions, RET to stop) ? 

yes
| ?- accept([b,b,a,b]).

true ? 

yes
| ?- accept([a,a,b,a,b,a]).

true ? 

yes
| ?- accept([b,a,a,b,a]).  

true ? 

yes
| ?- accept([b,b,a,b,b,b,a]).

true ? 

yes
| ?- accept([b]).            

no
| ?- accept([b,b]).

no
| ?- accept([a]).  

no
| ?- accept([a,b]).

no
| ?- accept([a,a,b]).

no
