class InvalidBalanceException extends Exception{
		InvalidBalanceException(String mssge){
		super(mssge);
		}
}
class UsersException
{

	public static void main(String args[])
		{
		try{
			int balance=1000;
			int withdraw=1200;
			if(balance<withdraw)
			{
				throw new InvalidBalanceException("Insufficient Balance");
			}
			
			
			
			}
		catch(InvalidBalanceException e)
			{
			System.out.println(e);
			}
		

		}
}