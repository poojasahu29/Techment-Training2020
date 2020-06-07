package com.techment;
import java.util.Scanner;
public class Ex46_SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        float sum = 0;

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no. of terms in series:");

        n = s.nextInt();

        Ex46_SumofSeries obj = new Ex46_SumofSeries();

        for(int i = 1; i <= n; i++)

        {

            sum = sum +(float)i / (obj.fact(i));

        }

        System.out.println("Sum of series:"+sum);

    }

    int fact(int x)

    {

        int mul = 1;

        while(x > 0)

        {

            mul = mul * x;

            x--;

        }

        return mul;

    }


	}


