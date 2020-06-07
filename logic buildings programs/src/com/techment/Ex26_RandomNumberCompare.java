package com.techment;
import java.util.Random;
public class Ex26_RandomNumberCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();  //random object creating

		int num1 = r.nextInt(20);
		int num2 = r.nextInt(20);

		System.out.println("1st Random Number is="+num1);
		System.out.println("2nd Random Number is="+num2);
		
		if ( num1 == num2 ) 
			System.out.println( "The random numbers are same" );
		else 
			System.out.println( "The random numbers are different" );
	}

}
