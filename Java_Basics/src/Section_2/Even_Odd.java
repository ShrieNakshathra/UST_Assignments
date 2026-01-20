package Section_2;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		if(num%2==0)
			System.out.println("The number is Even");
		else
			System.out.println("The number is Odd");
	}

}
