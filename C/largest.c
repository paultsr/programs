/*
Aim: Write a C program to find the largest of three numbers using if-else statement
Exp. No: 5
File Name: largest.c
Date : 17/10/2012
*/

#include<stdio.h>
main()
{
        int a,b,c;
        printf("\nEnter 3 no.s");
        scanf("%d%d%d",&a,&b,&c);
        if(a>b)
        { 
	        if(a>c)
                {
                        printf("%d is largest",a);
                }
                else
                {
                        printf("%d is largest",c);
                }
        }
        else if(b>c)
        {
                printf("%d is largest",b);
        }
        else
        {
                printf("%d is largest",c);
        }
}


/*
Compilation step 
gcc  largest.c  –o  largest

Execution step
./largest

Output
Enter 3 no.s 9  8  7
9  is largest
*/

