package com.techment;

import java.util.Scanner;

public class Ex9_First_Nterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,series=0;
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Enter the Number to get the cubic numbers series:");
        number= myobj.nextInt();
        System.out.println("First "+number+" Cubic Numbers are:") ;
        for(int i=1;i<=number;i++)
        {
        	series=i*i*i;
            System.out.println(+series) ;
        }
   
	}

}
