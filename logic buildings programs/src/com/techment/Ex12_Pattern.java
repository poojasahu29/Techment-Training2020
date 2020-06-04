package com.techment;
import java.util.Scanner; 
public class Ex12_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,i,j;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the numbers of lines you want");
		int number=sc.nextInt();								//taking number of lines as input
		System.out.println(" ");
		System.out.print("pattern is:\n");
		
		
		for(i=number; i>=1; i-- ){						//outer for loop(parent)
		 for(j=1; j<=i*2; j++){
		 System.out.print(" ");					//create space from at begining of each row
		 }											//inner for loop 1(child)
		 for(j=i; j<=number; j++){					//print right part of Piramid
		 System.out.print(j+" ");
		 }											//inner for loop 2
		for(j=number-1; j>=i; j--){
		 System.out.print(j+" "); 					//print left part of Piramid
		 }											//inner for loop 3
		  System.out.println();
		count++;									//count increse with 1
		 }
		 
		}
		

	}


