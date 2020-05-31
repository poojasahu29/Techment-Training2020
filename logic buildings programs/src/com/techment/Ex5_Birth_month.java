package com.techment;

import java.util.Scanner;

public class Ex5_Birth_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  Your month of birth as number :");
        month= s.nextInt();
        switch(month)
        {
        case 1: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is January.");
        		break;
        case 2: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is February.");
				break;
        case 3: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is March.");
				break;
        case 4: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is April.");
				break;
        case 5: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is May.");
				break;
        case 6: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is June.");
				break;
        case 7: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is July.");
				break;
        case 8: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is Aguest.");
        		break;
        case 9: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is September.");
				break;
        case 10: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is October.");
				break;
        case 11: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is November.");
				break;
        case 12: System.out.println("Your Entered Month Number is "+month+ " So Birth-Month Name is December.");
				break;
		default: System.out.println("Your Entered Month Number  is Invalid!! ");
        }
	}

}
