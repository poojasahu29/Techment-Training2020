package com.techment;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, n, temp;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter no. of element you want in array:");
	    n = s.nextInt();
	    int a[] = new int[n];//create array object to allocate the memory
	    System.out.println("Enter  the elements:");
	    for(i = 0; i < n; i++)
	    {
	        a[i] = s.nextInt();			//input store
	       
	    }

		for(i=1; i<n; i++)
			{
				temp=a[i];
				j=i-1;
					while((temp<a[j])&&(j>=0))
						{
							a[j+1]=a[j];
							j=j-1;
						}
					a[j+1]=temp;
			}

		System.out.println("After Sorting elements: ");
		for(i=0; i<n; i++)
		{
			System.out.println( a[i]);
		}
		

	}

}
