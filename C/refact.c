//vi refact.c
#include<stdio.h>
int fact(int m);
main()
{
        int n,f;
        printf("\nenter the number");
        scanf("%d",&n);
        f=fact(n);
        printf("\nfactorial of %d=%d",n,f);
}
int fact(int m)
{
        if (m<=1)
                return 1;
        else
                return(m*fact(m-1));
}
/*
Compilation step: gcc  refact.c  –o  refact
execution step:  ./refact
output:
enter the number5
factorial of 5=120
enter the number6
factorial of 6=720
*/
