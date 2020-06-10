package com.techment;
import java.util.Scanner;
public class Ex52_TraingleCanbeFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  int s1,s2,s3;
			  Scanner in = new Scanner(System.in);
			  System.out.print("Enter the 3 sides of traingle ");
			   s1 = in .nextInt();
			   s2 = in .nextInt();
			   s3 = in .nextInt();
			if(s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2)
				System.out.println("Entered sides of Traingle is Formed");
			else
				System.out.println("Entered sides of Traingle is  Not Formed");
			 
			 }
			

}
