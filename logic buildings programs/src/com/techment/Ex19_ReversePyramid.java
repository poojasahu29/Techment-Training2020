package com.techment;
import java.util.Scanner;
public class Ex19_ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, j, k, l;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers of lines you want");
		num = scanner.nextInt();
		
		for(i =0; i<num; i++){
			for(j = 0; j<=i; j++)
				System.out.print("  ");
			for(k = i+1; k<=num; k++ )
				System.out.print(k +" ");
			for(l = k-2; l>=i+1; l--)
				System.out.print(l +" ");
			System.out.println();
		}
	}

	}


