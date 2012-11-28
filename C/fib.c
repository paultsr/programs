/*
Aim: Write a C program to print the Fibonacci series
Exp. No: 11
File Name: fib.c
Date : 28/11/2012
*/

#include<stdio.h>
main()
{int i,a=0,b=1,c,n;
        printf("Enter the limit:");
        scanf("%d",&n);
        printf("%d\t%d",a,b);
        for(i=3;i<=n;i++)
        {       c=a+b;
                a=b;
                b=c;
                printf("\t%d",c);
        }
}

/*
Compilation step 
gcc  fib.c  –o  fib

Execution step
./fib

Output
Enter the limit: 5
0       1       1       2       3
*/

