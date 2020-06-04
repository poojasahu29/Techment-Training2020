package com.techment;
import java.util.Scanner;
public class Ex18_ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a,b,quotient;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value");
		a = scanner.nextInt();
		System.out.println("Enter the second value");
		b = scanner.nextInt();

		try{
			quotient = a/b;
			System.out.println("Result "+ quotient);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex +"Cannot divide by zero\n");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}



	}


