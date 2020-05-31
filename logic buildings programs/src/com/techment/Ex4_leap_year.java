package com.techment;
import java.util.Scanner;
public class Ex4_leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Year:");
        year = s.nextInt();
        if(year%4==0)
        	System.out.print("Your Entered Year "+year+"  is Leap Year");
        else
        	System.out.print("Your Entered Year "+year+"  is Not Leap Year");
        	
		}

}
