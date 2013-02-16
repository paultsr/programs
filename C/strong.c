//vi strong.c
#include<stdio.h>
int strong(int);
int fact(int);
main()
{
        int n,str;
        printf("enter no.");
        scanf("%d",&n);
        str=strong(n);
        if(str==n)
                printf("%d is strong",n);
        else
                printf("%d is not strong",n);
}
int strong(int x)
{
        int d,fd,st=0;
        while(x)
        {
                d=x%10;
                fd=fact(d);
                st=st+fd;
                x=x/10;
        }
        return(st);
}
int fact(int j)
{
        int f=1,i;
        for(i=1;i<=j;i++)
                f=f*i;
        return(f);
}
/*
Compilation step: gcc  strong.c  –o  strong
execution step:  ./strong
output:
enter no.145
145 is strong
enter no.123
123 is not strong
*/
