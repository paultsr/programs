//vi  factarg.c
#include<stdio.h>
int factr(int x);
main(int argc,char *argv[])
{
        int n,f;
        n=atoi(argv[1]);
        f=factr(n);
        printf("\nfactorial of %d is %d\n",n,f);
}
int factr(int x)
{
        if(x<=1)
                return 1;
        else
                return x*factr(x-1);
}
/*
Compilation step: gcc  factarg.c  –o  factarg
execution step:  ./ factarg
output:
./factarg 4
factorial of 4 is 24
./factarg 6
factorial of 6 is 720
*/
