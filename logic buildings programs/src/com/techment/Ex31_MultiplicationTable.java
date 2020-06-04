package com.techment;
import java.util.Scanner; 
public class Ex31_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No. to make a Table:");
		n=sc.nextInt();
		System.out.println("The Table "+n+ " is:\n");
		for(i=1;i<=10;i++)
		{
			s=n*i;
			System.out.println("\n"+s);
		}
	}

}
