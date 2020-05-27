/**
 * array right rotation
 */

#include <stdio.h>
#define MAX_SIZE 100  // Maximum array size

int main() {
   int arr[MAX_SIZE];
   int i, n, len, j,temp=0;;
   
   printf("Enter the size of array\n");
   scanf("%d",&len);
   printf("Enter the array elements\n");
   for (i = 0; i < len; i++) 
   {
      scanf("%d",&arr[i]);
   }
   printf("enter the rotation size\n");
   scanf("%d",&n);
   for (i = 0; i < n; i++) {
      int x = arr[0];
      for (j = 0; j < len; j++) {
         temp=arr[j];
         arr[j] = arr[j + 1];
         arr[j+1]=temp;
      }
      arr[len - 1] = x;
   }
   for (i = 0; i < len; i++) {
      printf("%d\t",arr[i] );
      
   }printf("\n");
}