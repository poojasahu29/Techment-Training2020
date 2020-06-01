package com.techment;
import java.util.Scanner;
public class Ex8_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder,sum=0,temp;
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Enter the Number that check number is Armstrong or Not:");
        number= myobj.nextInt();
        temp=number;
        for(int i=1;number>0;i++)
        {
        	remainder=number%10;
        	remainder=remainder*remainder*remainder;
        	number=number/10;
        	sum=sum+remainder;
        }
        if(sum==temp)
        	System.out.println("Entered Number is Armstrong Number: "+temp);
        else
        	System.out.println("Entered Number is Not  Armstrong Number: "+temp);
   }

}
