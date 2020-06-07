package com.techment;
import java.util.Scanner;
public class Ex23_BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float height,weight,bmi,heightinMeter;  
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter height in cm and weight in kgs");
		height=scanner.nextFloat();
		weight=scanner.nextFloat(); 
		
		heightinMeter=height/100;	//convert cm to meter
		bmi=weight/(heightinMeter*heightinMeter); //calculate BMI value
		System.out.println("BMI is: "+bmi);
		
		if(bmi < 18.5 )	 
			System.out.println("Underweight");
		else if(bmi>=18.5 && bmi<25)
			System.out.println("Normal");
		else if(bmi>=25 && bmi<30)
			System.out.println("Over Weight");
		else if(bmi>30)
			System.out.println("Obese");
	}

}
