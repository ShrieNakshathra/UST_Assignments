package Section_3;

import java.util.Scanner;

public class Qn_16 {

	public static void main(String[] args) {
		//Sum_of_digs_of_num
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number: ");//123
		int num=s.nextInt();
		int org_num=num;
		int sum=0;
		while(num!=0) {
		int last_dig=num%10;
		sum+=last_dig;
		num/=10;
		}
System.out.println(sum);
	}

}
