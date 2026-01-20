package Section_1;

import java.util.Scanner;

public class Qn_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Principal Amount: ");
		int p=s.nextInt();//Principal
		System.out.println("Enter the Number of Years: ");
		int n=s.nextInt();//No.of.years
		System.out.println("Enter the rate of Intrest: ");
		int r=s.nextInt();//Rate of intrest
		int SI=(p*n*r)/100;
		System.out.println("The Simple Intrest is "+SI);
				

	}

}
