/**
 * C program to count total number of duplicate elements in an array
 */
#include<stdio.h>
#define MAX_SIZE 100 
int  main()
{
    int a[MAX_SIZE], i, j, k, n,count=0;
    printf("\nEnter array size: ");
    scanf("%d", &n);

    printf("\nEnter %d array element: ", n);
    for(i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("\nOriginal array is: ");
    for(i = 0; i < n; i++)
    {
        printf(" %d", a[i]);
    }

    printf("\nNew array is: ");
    for(i = 0; i < n; i++)
    {
        for(j = i+1; j < n; )
        {
            if(a[j] == a[i])
            {
                for(k = j; k < n; k++)
                {
                    a[k] = a[k+1];
                    
                }
                n--;
                count++;    //count the number of value that is remove from array
            }
            else
            {
                j++;
            }
        }
    }
    //print the new array elements
    for(i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\nNumber of Remove Duplicate elemets is %d\n",count );
   
}