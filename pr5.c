//program for finding leap year 

#include<stdio.h>
void main()
{
    int y;
    printf("enter the year");
    scanf("%d",&y);
    
    if(y%4==0)
    {
        if(y%100==0)
        {
            if(y%400==0)
            {
                printf("%d is a leap year ",y);
            }
            else
            printf("%d not a leap year",y);
        }
        else
        printf("%d a leap year",y);
    }
    else
    printf("%d not a leap year ",y);
}