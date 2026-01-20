package Section_2;
import java.util.*;
public class Pos_Neg_zero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		if(num>0) {
			System.out.println("The given number is Positive");
		}
		else if(num==0) {
			System.out.println("The give number is Zero");
		
		}
		else {
			System.out.println("The given number is Negative");
		}
	}

}
