package com.techment;
import java.util.Scanner;
public class Ex48_ConvertBinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
         
         System.out.println("Enter a binary number:");
         int n=s.nextInt();
         
         int decimal=0,p=0;
         
         while(n!=0)
         {
             decimal+=((n%10)*Math.pow(2,p));
             n=n/10;
             p++;
         }
         
         System.out.println("Decimal is: "+decimal);
     }

	}


