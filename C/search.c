//vi search.c
#include<stdio.h>
main()
{
        int a[15],x,n,i,flag;
        printf("\n enter the no. of numbers");
        scanf("%d",&n);
        printf("\n enter the number");
        for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        printf("\n enter the number to be searched:");
        scanf("%d",&x);
        for(i=0;i<n;i++)
        {
                if (a[i]==x)
                {
                        flag=1;
                        break;
                }
        }
        if(flag==1)
                printf("%d found",x);
        else
                printf("%d not found",x);
}
/*
Compilation step: gcc  search.c  –o  search
execution step:  ./search
output:
enter the no. of numbers 3
 enter the number1
2
3
 enter the number to be searched:2
2 found
enter the no. of numbers3
enter the number1
2
3
 enter the number to be searched:4
4 not found
*/
