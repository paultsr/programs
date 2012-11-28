/*
Aim: Write a C program to check whether a number is Armstrong or not using do-while statement
Exp. No: 9
File Name: arm.c
Date : 21/11/2012
*/

#include<stdio.h>
main()
{int n,d,m,sum=0;
printf("enter the number:");
scanf("%d",&n);
m=n;
do
{
d=n%10;
sum=sum+(d*d*d);
n=n/10;
}while(n>0);
if(sum==m)
printf("the number is armstrong");
else
printf("the number is not armstrong");
}

/*
Compilation step 
gcc  arm.c  –o  arm

Execution step
./arm

Output
enter the number:153
the number is armstrong
enter the number:23
the number is not Armstrong

*/

