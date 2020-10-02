/*
Aim: Write a C program to check whether a given number is odd or even using conditional operator
Exp. No: 6
File Name: evenodd.c
Date : 17/10/2012
*/

#include<stdio.h>
main()
{ int a;
        printf("enter a number :");
        scanf("%d",&a);
        (a%2==0)?printf("%d is even",a):printf("%d is odd",a);
     return 0;
}

/*
Compilation step 
gcc  evenodd.c  -o  evenodd

Execution step
./evenodd

Output
enter a no. 5
5 is odd
*/

