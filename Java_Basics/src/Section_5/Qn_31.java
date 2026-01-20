package Section_5;

import java.util.Scanner;

public class Qn_31 {

	public static void main(String[] args) {
		//count no of words in sentence
		Scanner s= new Scanner(System.in);
		String str=" Hii, I am Visagan";
		String cnt_words[]=str.trim().split("\\s+");
		
		System.out.println(cnt_words.length);
		
		


	}
}
