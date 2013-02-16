//vi swap.c
#include<stdio.h>
main()
{int x,y;
        void swap(int,int);
        printf("enter two no.s\n");
        scanf("%d%d",&x,&y);
        printf("Before swap x=%dy=%d\n",x,y);
        swap(x,y);
}
void swap(int a,int b)
{int t;
        t=a;
        a=b;
        b=t;
        printf("after swap x=%dy=%d\n",a,b);
}
/*
Compilation step: gcc  swap.c  –o  swap
execution step:  ./swap
output:
enter two no.s
5 6
Before swap x=5y=6
after swap x=6y=5
*/
