package com.techment;
import java.util.Random;
public class Ex27_DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();  //random object creating

		int num1 = r.nextInt(20);
		int num2 = r.nextInt(20);

		System.out.println("1st Random Number is="+num1);
		System.out.println("2nd Random Number is="+num2);
		int sum=0,difference=0;
		if ( num1%2==0 && num2%2==0) 			//if random number are Even 
		{ 
			System.out.println( "both Random Number are Even" );
			sum=num1+num2;
			System.out.println( "The sum of Even Dice Number is "+sum );}
		else  {
			if(num1>num2)											//random number is different or 1st random number is bigger then 2nd
			{
				difference=num1-num2;
				System.out.println( "The random numbers are different"+difference );
				
			}
			else 
				if(num2>num1) {												//if 2nd random number is bigger then 1st random number
					difference=num2-num1;
					System.out.println( "The random numbers are different"+difference );
				}
			
	}

	}

}
