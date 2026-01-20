package Section_1;

import java.util.Scanner;

public class Qn_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		//Celsis to Fahrenheit
		System.out.println("Enter the Celsius: ");
		int C=s.nextInt();
		Double F=(C*1.8)+32;
		System.out.println("The Fahrenheit is:"+F);
		//Km to Miles
		System.out.println("Enter the Km's: ");
		int km=s.nextInt();
		Double miles=km*0.621371;
		System.out.println("Miles is "+miles);
		
				

	}

}
