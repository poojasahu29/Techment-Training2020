package com.techment;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, search_number,flag=0,mid,first_index,end_index;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];//create array object to allocate the memory
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();			//input store
           
        }
        System.out.println("Enter the number to be search:");
        search_number=s.nextInt();
        first_index=0;
        end_index=n-1;
        while(first_index<end_index)
		{
		mid=(first_index+end_index)/2;
		if(a[mid]==search_number)
		{
		flag=1;
		break;
		}
		else if(a[mid]>search_number)
		{
		end_index=mid-1;
		}
		else if(a[mid]<search_number)
		{
		first_index=mid+1;
		}
		}
		if(flag==1)
		System.out.println("Entered Number is present is given array ");
		else
		System.out.println("Entered Number is Not present is given array ");

	}
}

