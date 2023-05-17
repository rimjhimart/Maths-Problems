#include<stdio.h>
void main ()
{
    int r, c, i, j, a[10][10], b[10][10], sum[10][10];
    printf("enter the number of rows\n");
    scanf("%d", &r);
    printf("enter the number of columns\n");
    scanf("%d", &c);
    printf("enter the first matrix=\n");
    for(i=0;i<r;++i)
    {
        for(j=0;j<c;++j)
        {
            printf("enter elements a%d%d", i+1, j+1);
            scanf("%d", &a[i][j]);
        }
    }
    printf("enter the second matrix=\n");
    for(i=0;i<r;++i)
    {
        for(j=0;j<c;++j)
        {
            printf("enter the elements b%d%d", i+1, j+1);
            scanf("%d", &b[i][j]);
        }
    }
    for(i=0;i<r;++i)
    {
        for(j=0;j<c;++j)
        {
            sum[i][j]=a[i][j]+b[i][j];
        }
    }
    printf("sum of two matrices\n");
    for(i=0;i<r;++i)
    {
        for(j=0;j<c;++j)
        {
            printf("%d", sum[i][j]);
            if(j==c-1)
            {
                printf("\n");
            }
        } 
    }
}
