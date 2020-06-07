// Ex 2 - Even Odd Traffic Rule

import java.lang.*;
import java.util.Scanner;
System.out.println();
public class TrafficRule
{
	public static void main(String[] args) {

		System.out.println("Enter today's date:");

		Scanner scanner = new Scanner(System.in);
		int date = scanner.nextInt();

		if(date<1 || date>31)
	            System.out.println("Error: Date Invalid");
		else
		{
	        if(date%2==0)
	            System.out.println("Cars with even registration numbers are permitted today");
	        else
	            System.out.println("Cars with odd registration numbers are permitted today");
	    }		
	}
}