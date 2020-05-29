package com.techment;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i,temp,j,n;
			Scanner s = new Scanner(System.in);
		    System.out.println("Enter no. of elements you want in array:");
		    n = s.nextInt();
		    int a[] = new int[n];//create array object to allocate the memory
		    System.out.println("Enter  the elements:");
		    for(i = 0; i < n; i++)
		    {
		        a[i] = s.nextInt();			//input store
		       
		    }
	
		System.out.println(" before sorting : ");
		for(j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
						{
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
				}
		}
		 System.out.println("after sorting : ");
		 for(j=0;j<n;j++)
		{
			 System.out.println(a[j]);
		}
		
		}

	}


