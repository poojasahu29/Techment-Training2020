 package com.techment;

import java.util.Scanner;

public class Ex10_First_N_series {
	public void isPrime(int number) {
		
		    int  i,p,count,flag;
		    p=2;
		    i=1; 
		    while(i<=number)
		    {
		        flag=1;
		        for(count=2;count<=p-1;count++)
		        {
		            if(p%count==0)  //Will be true if p is not prime
		            {
		             flag=0;
		             break;      //Loop will terminate if p is not prime
		            }  
		        }
		            if(flag==1)
		            {
		            	 System.out.println(+p) ;
		             i++;
		            }
		        p++;
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Enter the Number that check number is Armstrong or Not:");
        number= myobj.nextInt();
        System.out.println("First "+number+" prime numbers are") ;
		 Ex10_First_N_series object=new  Ex10_First_N_series();
		 object.isPrime(number);
		

	}

}
