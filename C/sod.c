/*
Aim: Write a C program to find the sum of the digits of a number using while statement
Exp. No: 8
File Name: sod.c
Date : 21/11/2012
*/

#include<stdio.h>
main()
{int n,d,sum=0;
printf("enter the number");
scanf("%d",&n);
while(n>0)
{d=n%10;
sum=sum+d;
n=n/10;
}
n=0;
printf("sum of digits=%d",sum);
}

/*
Compilation step 
gcc  sod.c  –o  sod

Execution step
./sod

Output
enter the number  56
sum of digits=11
*/

