package com.techment;
import java.util.Scanner;
public class Program4_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i, OddSum = 0,Evensum=0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" how many number to insert in array : ");
		number = sc.nextInt();	
		
		int [] a = new int[number];
		
		System.out.print(" Please Enter " + number + " elements of an Array  : ");
		for (i = 0; i < number; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < number; i++)
		{
			if(a[i] % 2 == 0)
			{
				Evensum = Evensum + a[i]; 
			}
			else
			{
				OddSum = OddSum + a[i]; 
			}
		}		
		System.out.println(" The Sum of Even Numbers is= " + Evensum);
		System.out.println(" The Sum of Odd Numbers is = " + OddSum);
	}

	}

