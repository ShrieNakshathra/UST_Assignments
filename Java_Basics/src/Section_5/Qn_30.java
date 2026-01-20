package Section_5;

import java.util.Scanner;

public class Qn_30 {

	public static void main(String[] args) {
		//Palindrome /not in string
		Scanner s= new Scanner(System.in);
		String str="viiv";
		String rev="";
		   for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
		if(str.equals(rev))System.out.println("String is Palindrome");
		else System.out.println("String is Not a Palindorme");
		


	}

}
