package com.techment;

public class Ex35_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		  for (int i = 1; i <= n; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            } 
	             
	            System.out.println(); 
	        } 
	         
	        //Printing lower half of the pattern 
	         
	        for (int i = n-1; i >= 1; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }

	}

}
