package com.techment;
import java.util.Scanner;
class glasshouse
{
	public void check()
	{
		int digit,first_digit,second_digit,door_number=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two digit number:");
		digit=sc.nextInt();
		
		second_digit=digit%10;
		first_digit=digit/10;
		
		
		door_number=first_digit+second_digit;
		System.out.println("Exit GlassHouse Number is:"+door_number);
	}
public static void main(String args[])
	{
		glasshouse obj=new glasshouse();//create the object in class glasshouse
		obj.check();	//calling a function 
	}
}
