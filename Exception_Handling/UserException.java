class AgeException extends Exception{
		AgeException(String mssge){
		super(mssge);
		}
}
class UserException
{

	public static void main(String args[])
		{
		try{
			int age=12;
			if(age<18)
			{
				throw new AgeException("Age should be above 18");
			}
			
			
			
			}
		catch(AgeException e)
			{
			System.out.println(e);
			}
		

		}
}