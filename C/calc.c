/*
Aim: Write a C program to implement basic calculator using switch statement
Exp. No: 7
File Name: calc.c
Date : 21/11/2012
*/

#include<stdio.h>
main()
{float a,b,c;
        int choice;
        printf("enter two no. :");
        scanf("%f%f",&a,&b);
        printf("1.Adding\n2.Subtraction\n3.product\n4.division\n");
        printf("Enter choice:");
        scanf("%d",&choice);
        switch(choice)
        {
                case 1: c=a+b;
                        printf("sum=%f",c);
                        break;
                case 2: c=a-b;
                        printf("difference=%f",c);
                        break;
                case 3: c=a*b;
                        printf("product=%f",c);
                        break;
                case 4: c=a/b;
                        printf("div=%f",c);
                        break;
                default : printf("\n invalid choice\n");
        }
}

/*
Compilation step 
gcc  calc.c  –o  calc

Execution step
./calc

Output
enter two no. : 5  6
1.Adding
2.Subtraction
3.product
4.division
Enter choice:1
sum=11.000000
enter two no. : 5  6
1.Adding
2.Subtraction
3.product
4.division
Enter choice:2
difference=-1
enter two no. : 5  6
1.Adding
2.Subtraction
3.product
4.division
Enter choice:3
product=30
enter two no. : 5  6
1.Adding
2.Subtraction
3.product
4.division
Enter choice:4
div=0.833333
*/

