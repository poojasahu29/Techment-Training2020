package com.techment;
import java.util.Scanner;
public class Program5_pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i, sum;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" how many number to insert in array : ");
		number = sc.nextInt();	
		
		int [] a = new int[number];
		
		System.out.print(" Please Enter " + number + " elements of an Array  : ");
		for (i = 0; i < number; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print(" Enter the sum value: ");
		sum = sc.nextInt();	

	        for (i = 0; i < number; i++) {
	            int first = a[i];
	            for (int j = i + 1; j < number; j++) {
	                int second = a[j];

	                if ((first + second) == sum) {
	                	System.out.println("("+first+", "+second+")");
	                   
	                }
	            

	        }
	    }
	   
	}
}


