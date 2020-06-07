
package com.techment;
import java.util.Scanner;

public class Ex7_Battle_Soldiers{
	public static void main(String[] args) {
		
		int firstSoldier_number, lastSoldier_number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter1st soldier number:");
		firstSoldier_number = scanner.nextInt();
		System.out.print("Enter 1st soldier number:");
		lastSoldier_number =  scanner.nextInt();

		System.out.println("Soldiers come forward: ");

		for (int i = firstSoldier_number; i<=lastSoldier_number ; i++)
			System.out.println(i);
	}
}
