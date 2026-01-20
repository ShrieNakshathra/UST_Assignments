class ArithmeticException
{

	public static void main(String args[])
		{
		try{
			int arr[]={1,2};
			int a=arr[2];
			System.out.println(a);
			}
		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
		

		}
}