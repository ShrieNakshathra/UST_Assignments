package Exception_Handling;

class ArthimeticException
{

	public static void main(String args[])
		{
		
		
		try{
			int a=12;
			int b=0;
			int Div=a/b;
			System.out.println("Division:"+Div);
		    }
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());

		}
	}
}