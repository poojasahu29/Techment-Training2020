/*
print patterns 
*/
class patterns
{
	public void check()
	{
		for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=i;j++)
					{
						System.out.println(j);
					}
						System.out.println("\t");
			}
	}
public static void main(String args[])
	{
		patterns obj=new patterns();//create the object in class patterns
		obj.check();	//calling a function 
	}
}