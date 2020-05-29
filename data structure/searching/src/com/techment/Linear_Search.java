package com.techment;
import java.util.Scanner;

public class Linear_Search {
	
		    public static void main(String[] args) 
		    {
		        int n, search_number,flag=0;
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
		        for(int i = 0; i < n; i++)
		        {
		        	if(a[i]==search_number) //linearly search elements
		        	flag=1;		//if number is found flag is set by 1
		        	else
		        	continue;
		        System.out.println("your entered number present in "+i+" location "+a[i]);
		        
		           
		        }
		
		       if(flag==1)
		        System.out.println("Entered search number is present in given array");
		       else
		    	 System.out.println("Entered search number is not present in given array");

		    }
		}
		
	
	
	
	
	
	
	
	
	
	
	
	

	
