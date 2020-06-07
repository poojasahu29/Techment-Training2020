package com.techment;
import java.util.Scanner;
public class Ex20_ArrayIndexOutOfBOundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter No. of element in array");
		n=scanner.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter array elelment ");
		for(int i=0;i<n;i++) 
		{    
			array[i]=scanner.nextInt();	
		}
		try {
				System.out.print("Enter index of array");
				int i=scanner.nextInt();
				System.out.println(array[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		    System.out.println( e.getClass()); 
		}
		
	}

	}


