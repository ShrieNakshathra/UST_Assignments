package Section_2;
import java.util.*;
public class Leap_Non_Leap_year {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=s.nextInt();

	        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is NOT a Leap Year");
	        }
		

	}

}
