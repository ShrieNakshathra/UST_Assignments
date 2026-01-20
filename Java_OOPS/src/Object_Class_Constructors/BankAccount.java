package Object_Class_Constructors;

public class BankAccount {

	int accNo;
	String holderName;
	double bal;
	
	BankAccount(int accNo,String holderName,double bal){
		this.accNo=accNo;
		this.holderName=holderName;
		this.bal=bal;			
	}
	void showAccount() {
		System.out.println("Account Numbr is:"+accNo);
		System.out.println("holderName is: "+holderName);
		System.out.println("Balance: "+bal);
	}
	
}
