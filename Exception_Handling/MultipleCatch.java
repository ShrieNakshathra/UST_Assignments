class MultipleCatch
{

	public static void main(String args[])
		{
		try{
			int arr[]={1,2};
			int div=arr[1]/0;
			int last=arr[2];
			
			
			}
		catch(ArithmeticException e)
			{
			System.out.println(e);
			}
		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
		

		}
}