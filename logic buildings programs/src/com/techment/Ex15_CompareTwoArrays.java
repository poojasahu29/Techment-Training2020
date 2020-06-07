package com.techment;
import java.util.Scanner;
public class Ex15_CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean flag = false;
		int[] array1 = new int[15];
		int[] array2 = new int[15];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No. of element in array");
		n=scanner.nextInt();
		
		System.out.println("Enter first array elelment ");
		for(int i=0;i<n;i++) 
		{   								 //First_array input taking
			array1[i]=scanner.nextInt();	
		}
		System.out.println("Enter second array elelment ");
		for(int i=0;i<n;i++) 
		{    								//Second_array input taking
			array2[i]=scanner.nextInt();	
		}
		for(int i =0;i<n;i++)
		{
			if (array1[i]==array2[i]) 
				flag = true;
			else{
				flag=false;
				break;
			}
		}

		if (flag) 
			System.out.println("The arrays are same");
		else
			System.out.println("Arrays are different");
		
		


	}

}
