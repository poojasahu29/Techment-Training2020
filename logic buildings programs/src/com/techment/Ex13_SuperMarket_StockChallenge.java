package com.techment;
import java.util.Scanner; 
public class Ex13_SuperMarket_StockChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,total_quantity;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many Quantity to Enter the stock:");
		total_quantity=sc.nextInt();
		int a[] = new int[total_quantity];
		System.out.println("Enter the  "+total_quantity+" Product Quantity values:");
		
		for(i=0;i<total_quantity;i++)
		{
			 a[i] = sc.nextInt();	
		}
		int max_value=a[0];
		for(i=0;i<total_quantity;i++)
		{
			if (max_value<a[i]) 
                max_value = a[i]; 
		}
		System.out.println("The Maximum Quantity value is:"+max_value);
		
		

	}

}
