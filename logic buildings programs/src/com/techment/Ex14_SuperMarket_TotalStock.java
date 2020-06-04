package com.techment;
import java.util.Scanner; 
public class Ex14_SuperMarket_TotalStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,total_quantity,total_sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many Quantity to Enter the stock:");
		total_quantity=sc.nextInt();
		int a[] = new int[total_quantity];
		System.out.println("Enter the  "+total_quantity+" Product Quantity values:");
		
		for(i=0;i<total_quantity;i++)
		{
			 a[i] = sc.nextInt();
			 total_sum=total_sum+a[i];
		}
		System.out.println("Sum of  Total Products value is:"+total_sum);
		
		

	}

}

