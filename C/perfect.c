//vi perfect.c
#include<stdio.h>
int n;
main()
{
        void perfect(int);
        printf("enter no.");
        scanf("%d",&n);
        perfect(n);
}
void perfect(int a)
{
        int i,s=0;
        for(i=1;i<a;i++)
        {
                if(a%i==0)
                        s=s+i;
        }
        if(s==a)
                printf("it is perfect");
        else
                printf("it is not perfect");
}
/*
Compilation step: gcc  perfect.c –o  perfect
execution step:  ./perfect
output:
enter no.6
it is perfect
enter no.21
it is not perfect
*/
