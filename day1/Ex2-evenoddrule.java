/*Write a program to accept the day value as input and display appropriate message as output based on the day  .
*/
import java.util.Scanner;
class trafficconjestion
{
	public void evenoddrule ()
	{
		int date;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date between 1 to 31--");
		date=sc.nextInt();
		if(date<31&&date>1)
			{
				if(date%2==0)
					System.out.println("Cars with Even Registration numbers are permitted Today");
					
				else
					System.out.println("Cars with Odd Registration numbers are permitted Today");
			}
		else
			System.out.println("Please Enter valid date!");
						
	}
public static void main(String args[])
	{
		trafficconjestion obj=new trafficconjestion();//create the object in class trafficconjestion
		obj.evenoddrule();	//calling a function 
	}
}
