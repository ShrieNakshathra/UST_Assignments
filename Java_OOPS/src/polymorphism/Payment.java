package polymorphism;

public class Payment {

	public static void pay(int amt) {
		System.out.println("Paid amount is: "+amt);
	}
	public static void pay(int amt,String mode) {
		System.out.printf("Paid amount is %d through %s mode",amt,mode);
	}
}
