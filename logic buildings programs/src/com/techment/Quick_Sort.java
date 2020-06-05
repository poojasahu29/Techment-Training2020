package com.techment;

import java.util.Scanner;

public class Quick_Sort {
	
	public void quicksort( int element[],int first,int last){
		   int i, j, pivot, temp;

		   if(first<last){
		      pivot=first;
		      i=first;
		      j=last;

		      while(i<j){
		         while(element[i]<=element[pivot]&&i<last)
		            i++;
		         while(element[j]>element[pivot])
		            j--;
		         if(i<j){
		            temp=element[i];
		            element[i]=element[j];
		            element[j]=temp;
		         }
		      }

		      temp=element[pivot];
		      element[pivot]=element[j];
		      element[j]=temp;
		      quicksort(element,first,j-1);
		      quicksort(element,j+1,last);

		   }
	} 
public static void main(String[] args) {
	int i, n;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int element[] = new int[n];//create array object to allocate the memory
    System.out.println("Enter  the elements:");
    for(i = 0; i < n; i++)
    {
        element[i] = s.nextInt();			//input store
       
    }
      Quick_Sort obj=new Quick_Sort();
      obj.quicksort(element,0,n-1);

      System.out.println("Order of Sorted elements: ");
      for(i = 0; i < n; i++)
      {
    	  System.out.println(element[i]);		
         
      }
	  
	   
	}
}

