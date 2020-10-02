//vi leap.c
#include<stdio.h>
main()
{
        int y;
        printf("Enter the year : ");
        scanf("%d",&y);
        if(y%4==0)
        {
                printf("It is a leap year");
        }
        else
         {
           printf("It is not a leap year");
         }
}

/*
Compilation step:  gcc  leap.c  –o  leap
execution step:  ./leap
output:
enter the year2004
it is a leap year
enter the year2003
it is not a leap year
*/
