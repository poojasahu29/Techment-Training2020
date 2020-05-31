package com.techment;

import java.util.Scanner;

public class Ex6_calculator {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			int first_number,second_number;
			
	        Scanner myobj = new Scanner(System.in);
	      
	        System.out.println("Enter the First-Number:");
	        first_number= myobj.nextInt();
	       
	        System.out.println("Enter the Arithmetic Opeator In which you want to perform the operation:");
	        char operator=myobj.next().charAt(0);
	        System.out.println("Enter the Second-Number:");
	        second_number=myobj.nextInt();
	        switch(operator)
	        {
	        case '+':System.out.println("Addition:"+(first_number+second_number));
	        		break;
	        case '-':System.out.println("Subtraction:"+(first_number-second_number));
    				break;
	        case '*':System.out.println("Multipliction:"+(first_number*second_number));
    				break;
	        case '/':System.out.println("Division:"+(first_number/second_number));
    				break;
	        case '%':System.out.println("Remainder:"+(first_number%second_number));
    				break;
	        default:System.out.println("Invalid Operator!!");
    				
	        }
	        
			}
}
