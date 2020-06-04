package com.techment;
import java.util.Scanner;
public class Ex17_InvalidAgeException {
	
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter your age: ");
	  int age = s.nextInt();
	  
		try{
			if (age >= 18) 
				System.out.println("Welcome to Vote");
			else
				throw new InvalidAgeException("Invalid Age...");
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
		}
	 }
	

	}
class InvalidAgeException extends Exception{
		public InvalidAgeException(String str){
			super(str);
		}
	}


