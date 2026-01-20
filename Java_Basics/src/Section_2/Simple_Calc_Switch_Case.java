package Section_2;

import java.util.Scanner;

public class Simple_Calc_Switch_Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the Second number");
		int num2=s.nextInt();
		System.out.println("Enter the Operand: ");
		char choice=s.next().charAt(0);
		switch(choice){
		case '+':
			int sum=num1+num2;
			System.out.println("Addition of two num is: "+sum);
			break;
		case '-':
			int diff=num1-num2;
			System.out.println("Subtraction of two num is: "+diff);
			break;
		case '*':
			int pro=num1*num2;
			System.out.println("Product of two num is: "+pro);
			break;
		case '/':
			int quo=num1/num2;
			System.out.println("Quotient of two num is: "+quo);
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
