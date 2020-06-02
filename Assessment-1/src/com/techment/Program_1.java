package com.techment;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=a++ - ++a - a++ + ++a -a--;
		System.out.println("The value of b is: "+b);
		 b=--a + a-- + ++a + a-- -++a ;
		 System.out.println("After The value of b is: "+b);


	}

}
