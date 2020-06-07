package com.techment;
import java.util.Scanner;
public class Ex44_HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,herons=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 sides of a triangle as integer:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		herons=(a+b+c)/2;
		System.out.println("Area of Traingle is: "+herons);
		

	}

}
