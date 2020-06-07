import java.util.Scanner;

public class CompareArrays{
	public static void main(String[] args) {
		
		int size;
		boolean isSame = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = scanner.nextInt();

		int array1[] = new int[size];
		int array2[] = new int[size];

		System.out.println("Enter the values of the array 1");
		for (int i =0;i<size; i++)
			array1[i] = scanner.nextInt();

		System.out.println("Enter the values of the array 2");
		for (int i =0;i<size; i++)
			array2[i] = scanner.nextInt();
		for (int i =0;i<size; i++)
		{
			if (array1[i]==array2[i]) 
				isSame = true;
			else{
				isSame=false;
				break;
			}
		}

		if (isSame) 
			System.out.println("The arrays are same");
		else
			System.out.println("Arrays are different");
		
		


	}
}