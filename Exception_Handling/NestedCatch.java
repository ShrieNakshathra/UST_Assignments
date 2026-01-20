class NestedCatchz
{

	public static void main(String args[])
		{
		try{
			int arr[]={1,2};
			
					
			try{
				int div=arr[1]/0;
				}
				
			
			
		catch(ArithmeticException e)
			{
			System.out.println(e);
			}
			int b=arr[3];	
			
		}
		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
		

		}
}