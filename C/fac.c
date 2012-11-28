/*
Aim: Write a C program to find the Factorial of a number using for statement
Exp. No: 10
File Name: fac.c
Date : 21/11/2012
*/

#include<stdio.h>
main()
{int n,f=1,i;
printf("enter the number:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{f=f*i;
}
printf("factorial=%d",f);
}

/*
Compilation step 
gcc  fac.c  –o  fac

Execution step
./fac

Output
enter the number: 5
factorial=120
*/

