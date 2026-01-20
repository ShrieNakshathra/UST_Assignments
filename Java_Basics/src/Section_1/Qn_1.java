package Section_1;

import java.util.*;

public class Qn_1 {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
		//Getting two no's
	System.out.println("Enter the num1:");
		int num1=s.nextInt();
		System.out.println("Enter the num2");
		int num2=s.nextInt();
		
		//Sum
		int sum=num1+num2;
		//difference
		int diff=num1-num2;
		//Product
		int pro=num1*num2;
		//Quotient
		int quo=num1/num2;
		System.out.println("The sum is: "+ sum);
		System.out.println("The Difference is: "+diff);
		System.out.println("The Product is: "+pro);
		System.out.println("The Quotient is: "+quo);
	}

}
