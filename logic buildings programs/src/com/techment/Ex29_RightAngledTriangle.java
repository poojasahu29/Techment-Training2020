package com.techment;
import java.util.Scanner;
public class Ex29_RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	     int first_angle,second_angle,third_angle;
	     
	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.println("Enter the value of the Three  angle");
	    
	     first_angle=scanner.nextInt();
	     second_angle=scanner.nextInt();
	     third_angle=scanner.nextInt();
	     
	     if(first_angle>second_angle&&first_angle>third_angle) {
	         if((first_angle*first_angle)==(second_angle*second_angle)+(third_angle*third_angle))
	        	 System.out.println("given angles is  Right Angled Triangle");
	         else 
	        	 System.out.println("given angles is Not Right Angled Triangle");
	        } else if(second_angle>third_angle&&second_angle>first_angle) {
	            if((second_angle*second_angle)==(third_angle*third_angle)+(first_angle*first_angle))
	            	System.out.println("given angles is  Right Angled Triangle");
	            else
	            	System.out.println("given angles is Not Right Angled Triangle");
	        } else if(third_angle>first_angle&&third_angle>second_angle) {
	            if((third_angle*third_angle)==(first_angle*first_angle)+(second_angle*second_angle))
	            	System.out.println("given angles is  Right Angled Triangle");
	            else
	            	System.out.println("given angles  is Not  Right Angled Triangle");
	        }


	}

}
