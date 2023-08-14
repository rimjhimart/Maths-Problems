#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
    int n=0,n2=0, m;
    char str1[50];
    char str2[50];
    printf("enter any name:");
    scanf("%s", str1);
    n=strlen(str1);
    printf("\n string length%d\n",n);
    printf("enter other string\n");
    scanf("%s", str2);
    n2=strlen(str2);
    m=strcmp(str1,str2);
}