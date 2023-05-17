#include<stdio.h>
int main()
{
    int n;
    printf("enter a number");
    scanf("%d,&n");
    printf("hi");
    if (n%2==0)
    {
        printf("even num %d",n);
    }
    else
    {
        printf("odd%d",n);
    }
    return 0;
}