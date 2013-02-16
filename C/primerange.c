//vi primerange.c
#include<stdio.h>
main()
{
        int n,flag,i,j;
        printf("\nenter the range");
        scanf("%d",&n);
        for(i=2;i<n;i++)
        {
                flag=0;
                for(j=2;j<=i/2;j++)
                {
                        if(i%j==0)
                        {
                                flag=1;
                                break;
                        }
                }
                if(flag==0)
                        printf("%d\t",i);
        }
}
/*
Compilation step: gcc  primerange.c  –o  primerange
execution step:  ./primerange
output:
enter the range5
2       3       
enter the range10
2       3       5       7
*/
