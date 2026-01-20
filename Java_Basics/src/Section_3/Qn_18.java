package Section_3;

import java.util.Scanner;

public class Qn_18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number: ");//123
		int num=s.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			int last_dig=num%10;
			rev=rev*10+last_dig;
			num/=10;
		}
		if(org_num==rev) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindorme");


	}

}
