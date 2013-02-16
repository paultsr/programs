//vi student.c
#include<stdio.h>
struct student
{
        int rno;
        int mark;
        char name[20];
};
main()
{
        int i,n;
        printf("\n enter the no. of students:");
        scanf("%d",&n);
        struct student s[n];
        for(i=1;i<=n;i++)
        {
                printf("\n enter the details of student %d",i);
                printf("\n enter rollno.:");
                scanf("%d",&s[i].rno);
                printf("\n enter name:");
                scanf("%s",&s[i].name);
                printf("\n enter mark:");
                scanf("%d",&s[i].mark);
        }
        printf("\n STUDENT DETAILS:\n");
        printf("\n ROLLNO.\t\tNAME\t\tMARK\n");
        printf("\n _______\t\t____\t\t____\n");
        for(i=1;i<=n;i++)
        {
                printf("\n %d\t\t\t%s\t\t%d\t\t",s[i].rno,s[i].name,s[i].mark);
                printf("\n");
        }
}
/*
Compilation step: gcc  student.c  –o  student
execution step:  ./ student
output:
enter the no. of students:3
 enter the details of student 1
 enter rollno.: 1
 enter name: martin
 enter mark: 90
 enter the details of student 2
 enter rollno.: 2
 enter name: livin
enter mark: 90
enter the details of student 3
 enter rollno.: 3
enter name: majo
enter mark: 90
STUDENT DETAILS:
 ROLLNO.                NAME            MARK
 _______                ____            ____
 1                      martin          90
 2                      livin           90
 3                      majo            90
*/
