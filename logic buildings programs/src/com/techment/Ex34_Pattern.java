package com.techment;

public class Ex34_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
	         
		 for (int i = 1; i <= n; i++) 
	        { 
	            for (int j = n; j >= i; j--)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	}

}
