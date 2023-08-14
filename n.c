#include<stdio.h>
void main()
{
    int Day;
    printf("enter the number 1 to 7\n");
    scanf("%d", &Day);
    switch(Day)
    {
        case 1:
        printf("monday");
        break;
        case 2:
        printf("tuesday");
        break;
        case 3:
        printf("wednesday");
        break;
        case 4:
        printf("thursday");
        break;
        case 5:
        printf("friday");
        break;
        case 6:
        printf("saturday");
        break;
        printf("sunday");
        break;
    }
}