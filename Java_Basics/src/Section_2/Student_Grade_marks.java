package Section_2;

import java.util.Scanner;

public class Student_Grade_marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Mark");
		int mark=s.nextInt();
		if(mark>=90)
			System.out.println("Grade A");
		else if(mark>=75)
			System.out.println("Grade B");
		else if(mark>=60)
			System.out.println("Grade C");
		else
			System.out.println("Fail");
			

	}

}
