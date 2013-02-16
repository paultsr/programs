//vi fileop.c
#include<stdio.h>
#include<string.h>
main()
{
        FILE*fp;
        char c;
        printf("\nData input:\n");
        fp=fopen("ME-B","w");
        while((c=getchar())!=EOF)
        {
                putc(c,fp);
        }
        fclose(fp);
        printf("\nData output:\n");
        fp=fopen("ME-B","r");
        while((c=getc(fp))!=EOF)
        {
                printf("%c",c);
        }
        fclose(fp);
}
/*
Compilation step: gcc  fileop.c  –o  fileop
execution step:  ./ fileop
output:
Data input:
MECHANICAL ENGINEERING
ME-B BATCH

Data output:
MECHANICAL ENGINEERING
ME-B BATCH
*/
