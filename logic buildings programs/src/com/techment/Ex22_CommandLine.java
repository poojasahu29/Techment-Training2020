 class Ex22SortingCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=args.length;
		 int a[] = new int[size];
		for(int i=0; i<size; i++) 
		{
			a[i]=Integer.valueOf(args[i]);
			
			}
		for(int i=0; i<size; i++) 
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted order: ");
		for(int i=0;i<size;i++) {
			System.out.print(a[i] +" ");
		
	}
	
	
}
}
