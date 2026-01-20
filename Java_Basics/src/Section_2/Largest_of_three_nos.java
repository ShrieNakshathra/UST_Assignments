package Section_2;

import java.util.Scanner;

public class Largest_of_three_nos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the Second number");
		int num2=s.nextInt();
		System.out.println("Enter the third number");
		int num3=s.nextInt();
		if(num1<num2 && num3<num2)
			System.out.println("Second number is the largest number");
		else if(num1<num3 && num2<num3)
			System.out.println("Third number is the largest number");
		else
			System.out.println("First number is the largest number");
	}

}
