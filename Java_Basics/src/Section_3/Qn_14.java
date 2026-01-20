package Section_3;
import java.util.*;
public class Qn_14 {

	public static void main(String[] args) {
		//Factorial of num
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();//4
		int number=num;
		int fact=1;
		while(num>=1) {
			fact*=num;
			num--;
		}
		System.out.printf("The Factorial of %d is %d",number,fact);
	}

}
