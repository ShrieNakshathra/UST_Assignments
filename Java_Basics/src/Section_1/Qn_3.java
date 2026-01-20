package Section_1;
import java.util.*;
public class Qn_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Length: ");
		int len=s.nextInt();
		System.out.println("Enter the Breadth: ");
		int breadth=s.nextInt();
		int area=len *breadth;
		System.out.println("Area of rectangle is: "+area);
		int perimeter=2*(len+breadth);
		System.out.println("perimeter of rectangle is: "+perimeter);
		

	}

}
