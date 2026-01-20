package Section_5;

import java.util.Scanner;

public class Qn_29 {

	public static void main(String[] args) {
		//Rev a string
		Scanner s= new Scanner(System.in);
		String str="Visagan";
		String rev="";
		   for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
		System.out.println(rev);
		

	}

}
