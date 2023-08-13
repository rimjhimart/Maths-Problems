#include<stdio.h>
void mian()
{
    int i, n, flag=0;
    printf("enter the number");
    scanf("%d",&n);
    if(n==0||n==1)
    flag=1;
    for(int i=2;i<=n;i++)
    if(i%n==0)
    {
        flag=1;
        break;
    }
    if(flag==0)
    printf("prime");
    else
    printf("not prime");
    
    
}