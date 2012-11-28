/*
Aim: Write a C program to find the sum of two numbers
Exp. No: 4
File Name: add.c
Date : 17/10/2012
*/

#include<stdio.h>
main()
{
int a,b,sum;
printf("Enter two no.s");
scanf("%d%d",&a,&b);
sum=a+b;
printf("sum=%d",sum);
}

/*
Compilation step 
gcc  add.c  –o  add

Execution step
./add

Output
Enter two no.s 2  3 
sum=5
*/

