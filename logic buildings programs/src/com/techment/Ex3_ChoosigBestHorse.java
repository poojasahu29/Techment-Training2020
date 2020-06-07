package com.techment;
import java.util.Scanner;
public class Ex3_ChoosigBestHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horse_weight1,horse_weight2,horse_weight3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Three Horses Weight");
		horse_weight1=scanner.nextInt();
		horse_weight2=scanner.nextInt();
		horse_weight3=scanner.nextInt();
		
		if(horse_weight1>horse_weight2)
		{
			if(horse_weight1>horse_weight3)
				System.out.println("this Horse Weight is Maximum--\n"+horse_weight1);
											
			else
				System.out.println("this Horse Weight is Maximum--\n"+horse_weight3);
										
		}
		else
		{
			if(horse_weight2<horse_weight3)
				System.out.println("this Horse Weight is Maximum--\n"+horse_weight3);
												
			else
				System.out.println("this Horse Weight is Maximum --\n"+horse_weight2);
												
		}
		if(horse_weight1==horse_weight2)
		{
			if(horse_weight1==horse_weight3)
				System.out.println("Entered weights are not distinct values");
											
			else
				System.out.println("Entered weights are  distinct values");
										
		}
		else
		{
			if(horse_weight2==horse_weight3)
				System.out.println("Entered weights are not distinct values");										
			else
				System.out.println("Entered weights are  distinct values");
												
		}
						
		}

	}

