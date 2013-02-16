//vi large.c
#include<stdio.h>
main()
{int a[15],n,i,lar;
        printf("\n enter the no. of numbers");
        scanf("%d",&n);
        printf("\n enter the no.s");

        for(i=0;i<n;i++)
        {
                scanf("%d",&a[i]);
                lar=a[0];
        }
        for(i=0;i<n;i++)
        {
                if( a[i]>lar )
                        lar=a[i];
        }
        printf("%d is largest",lar);

}
/*
Compilation step: gcc  large.c  –o  large
execution step:  ./large
output:
enter the no. of numbers  5
 enter the no.s  1
2
3
4
5
5 is largest 
*/
