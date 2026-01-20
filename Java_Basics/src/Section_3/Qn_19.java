package Section_3;

import java.util.Scanner;

public class Qn_19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number: ");//5 terms
		int num=s.nextInt();
		int a=0,b=1;
		System.out.println(a+" "+b+" ");
		while(3<=num) {
			System.out.println(b);
			a=b;
			b=a+b;
			
			num++;
		}



	}

}
