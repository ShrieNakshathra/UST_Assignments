class InvalidBalanceException extends Exception{
		InvalidBalanceException(String mssge){
		super(mssge);
		}
}


class ThrowsException {
void balance() throws InvalidBalanceException{
		try{
			int balance=1000;
			int withdraw=1200;
			if(balance<withdraw)
			{
				throw new InvalidBalanceException("Insufficient Balance");
			}
			
			
			
			}
finally{
		System.out.println("throwing Exception");
	}

}

	public static void main(String args[])
		{
ThrowsException te=new ThrowsException();
		try{
		
		te.balance();
		
		}
catch(InvalidBalanceException e)
			{
			System.out.println(e);
			}
		
	
		
		}
}