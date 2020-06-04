package com.techment;
import java.util.Scanner;
public class Ex17_InvalidAgeException extends Exception {

	public Ex17_InvalidAgeException(String str) {
	  System.out.println(str);
	 }
	
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter your age: ");
	  int age = s.nextInt();
	  
	  try {
	   if(18>=age) 
	    throw new Ex17_InvalidAgeException("Invalid age");
	   else
	    System.out.println("Welcome to Vote....");
	  }
	  catch (Ex17_InvalidAgeException b) {
	   System.out.println(b);
	  }
	 }
	

	}


