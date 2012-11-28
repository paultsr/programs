/*
Aim: Write a C program to display the following pattern
1
1 	2
1 	2 	3
1	2	3	4
Exp. No: 13
File Name: pat.c
Date : 28/11/2012
*/

#include<stdio.h>
main()
{
        int i,j,n;
        printf("\nEnter the number of rows:");
        scanf("%d",&n);
        for(i=1;i<=n;i++)
        {
                for(j=1;j<=i;j++)
                {printf("%d\t",j);
                }
                printf("\n");
        }
}

/*
Compilation step 
gcc  pat.c  –o  pat

Execution step
./pat

Output
Enter the number of rows:4
1
1       2
1       2       3
1       2       3       4
*/

