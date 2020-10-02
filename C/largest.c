/*
Aim: Write a C program to find the largest of three numbers using if-else statement
Exp. No: 5
File Name: largest.c
Date : 17/10/2012
*/


#include<stdio.h>
main()
{
        int a,b,c,big;
        printf("\nEnter 3 numbers:");
        scanf("%d%d%d",&a,&b,&c);
         big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
	printf("\nThe biggest number is : %d", big);
	
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

