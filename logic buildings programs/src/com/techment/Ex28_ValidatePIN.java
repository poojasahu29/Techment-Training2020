package com.techment;
import java.util.Scanner;
public class Ex28_ValidatePIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int pin = 12345;

		System.out.print("Enter Your PIN: ");
		int new_pin = scanner.nextInt();
		        
		while (new_pin!=pin)
		{
			System.out.println("Incorrect PIN Entered Please, Try again!!!");
			System.out.print("Enter Your PIN: ");
			new_pin = scanner.nextInt();
		}
		        
		System.out.println("PIN Accepted");
	}

	}

