/*
Aim: Write a C program to check whether a given number is prime or not
Exp. No: 12
File Name: prime.c
Date : 28/11/2012
*/

#include<stdio.h>
main()
{
        int n,i,flag=0;
        printf("\nEnter the number:");
        scanf("%d",&n);
        if(n==1)
        {printf("\nNumber is not prime");
        }
        else
        {for(i=2;i<=(n/2);i++)
                {
                        if(n%i==0)
                        {flag=1;
                                break;
                        }
                }
                if(flag==1)
                        printf("\nNumber is not prime\n");
                else
                        printf("\nNumber is prime\n");
        }
}

/*
Compilation step 
gcc  prime.c  –o  prime

Execution step
./prime

Output
Enter the number:5
Number is prime

Enter the number:4
Number is not prime
*/

