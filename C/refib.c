//vi refib.c
#include<stdio.h>
int fib(int m);
main()
{
        int n,i,x;
        printf("\nenter the range:");
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
                x=fib(i);

                printf("%d\t",x);
        }
}
int fib(int m)
{
        if(m<=1)
                return m;
        else
                return(fib(m-1)+fib(m-2));
}
/*
Compilation step: gcc  refib.c  –o  refib
execution step:  ./refib
output:
enter the range:5
0       1       1       2       3       
enter the range:8
0       1       1       2       3       5       8       13
*/
