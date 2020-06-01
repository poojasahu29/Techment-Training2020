package com.techment;

import java.util.Scanner;

public class Ex16_Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Enter the Number :");
        number= myobj.nextInt();
        if(number%8==0 && number%3==0)
        	System.out.println("Number is Divisible by Both 8 and 3.");
        else
        	System.out.println("Number is Not Divisible by Both 8 and 3.");
	}
}
