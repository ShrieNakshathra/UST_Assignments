class InvalidBalanceException extends Exception{
		InvalidBalanceException(String mssge){
		super(mssge);
		}
}


class ReThrowsException {
void balance() throws InvalidBalanceException{
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
			System.out.println("loggin in balance()"+e);

			}


}

	public static void main(String args[])
		{
ReThrowsException te=new ReThrowsException();
		try{
		
		te.balance();
		
		}
catch(InvalidBalanceException e)
			{
			System.out.println(e);
			}
		
	
		
		}
}