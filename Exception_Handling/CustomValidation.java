

class InvalidBalanceException extends Exception{
		InvalidBalanceException(String mssge){
		super(mssge);
		}
}

class InvalidAgeException extends Exception{
		InvalidAgeException(String msge){
			super(msge);}
	}



class CustomValidation {

void age() throws InvalidAgeException{
	int age=19;
		if(age<20)
		throw new InvalidAgeException("Invalid age");
	}

void balance() throws InvalidBalanceException{
int balance=1000;
			int withdraw=1200;
			if(balance<withdraw)
			{
				throw new InvalidBalanceException("Insufficient Balance");
			}

}
	
		
	public static void main(String args[])
		{
CustomValidation cv=new CustomValidation();
	try{
		
		cv.age();
		cv.balance();
	    }
		catch(InvalidBalanceException e)
			{
			System.out.println(e);
			}
		catch(InvalidAgeException e)
			{
			System.out.println(e);
			}

	
		
		}
}