package com.techment;

import java.util.Scanner;

public class Ex45_AccountLocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int pin = 12345,count=0;

		System.out.print("Enter Your PIN: ");
		int new_pin = scanner.nextInt();
		    
		while(count!=2) { 
			if(new_pin == pin) {  
				System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT”.");
				break;
				}
			else {
				System.out.println("Incorrect pin entered please, again enter pin!!");
				new_pin=scanner.nextInt(); 
				count++;
				}
			}
			if(count==2) 
				System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}

	
}
