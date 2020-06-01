package task;

import java.util.Scanner;

public class Lowest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,lowest,second_lowest;	
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];//create array object to allocate the memory
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();//input store
        }
        
        lowest=second_lowest=arr[0];	//initialize the both variables with assumes that is first element of array is lowest element...
        
        for(int i=1;i<n;i++)
        {
            if(lowest>arr[i])
            {
                second_lowest=lowest;
                lowest=arr[i];
            }
            else if(second_lowest>arr[i] && arr[i]!=lowest)
            {
                second_lowest=arr[i];
            }
        }
        
        System.out.println("\nThe second smallest element is:" +second_lowest);
        }
	}


