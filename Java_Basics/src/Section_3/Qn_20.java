package Section_3;

import java.util.Scanner;

public class Qn_20 {

	public static void main(String[] args) {
		//Check_Prime_Number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int num=s.nextInt();
		int div=2;
		int flag=1;
		while(div<=num/2) {
			if(num%div==0)
				flag=0;
			div++;
		}
		if(flag==1) {
			System.out.println("Given number is Prime number");
		}
		else {
			System.out.println("Given number is Not a Prime number");
		}
	}

}