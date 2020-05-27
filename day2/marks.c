/*
write a array program to calculate the total marks ,max marks, min marks, passes subjects , failed subjects , total passes or total failed subjects in given by the user subject value 

*/

#include <stdio.h>

#define MAX_SIZE 100   // Maximum array size

int main()
{
    int arr[MAX_SIZE],pass[MAX_SIZE],fail[MAX_SIZE];
    int i, max, min, total_marks=0,size,count1=0,count2=0;

    /* Input size of the array */
    printf("How many Subjects marks to be entered: ");
    scanf("%d", &size);

    /* Input array marks */
    
    for(i=0; i<size; i++)
    {
        printf("Enter Subjects Marks  :%d ",i);
        scanf("%d", &arr[i]);
        total_marks=total_marks+arr[i];
    }


    /* Assume first element as maximum and minimum */
    max = arr[0];
    min = arr[0];

    /*
     * Find maximum and minimum in all array.
     */
    for(i=1; i<size; i++)
    {
       
        if(arr[i] > max)
        {
            max = arr[i];
        }

    
        if(arr[i] < min)
        {
            min = arr[i];
        }
    }
    /* check passes*/
     for(i=0; i<size; i++)
    {
        if(arr[i]>=50)
        {
            pass[i]=arr[i];
            count1++;
             printf("passes subjects are :%d\n",pass[i]);
        }
    }    
   
    printf("Total Number of pass in subjects %d\n",count1); 
       /*check failed*/
    for(i=0; i<size; i++)
    {
        if(arr[i]<50)
        {
            fail[i]=arr[i];
            count2++;
             printf("failed subjects are :%d\n",fail[i]);
        }
    }    
   
    printf("Total Number of failed in subjects %d\n",count2); 
       

    /* Print */
    printf("Total Marks is %d\n",total_marks);
    printf("Maximum Marks is  = %d\n", max);
    printf("Minimum Marks is = %d", min);


    return 0;
}