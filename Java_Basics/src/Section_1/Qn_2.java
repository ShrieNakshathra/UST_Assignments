package Section_1;

import java.util.Scanner;

public class Qn_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the num1:");
		int num1=s.nextInt();//500
		System.out.println("Enter the num2");
		int num2=s.nextInt();//300
		
		//Using temp_var
		/*
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Now the num1 is: "+num1);
		System.out.println("Now the num2 is: "+num2);
		//Without using temp_var
		 */
		 num1=num1+num2;//800
		 num2=Math.abs(num1-num2);//500
		num1=num1-num2;//300
		System.out.println("Now the num1 is: "+num1);
		System.out.println("Now the num2 is: "+num2);
		
	}

}
