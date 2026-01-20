package Section_5;
import java.util.*;
public class Qn_28 {

	public static void main(String[] args) {
		//cnt vowels and cons in string
		Scanner s= new Scanner(System.in);
		String str="Visagan";
		int cnt_vow=0;
		int cnt_cons=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='0'|| str.charAt(i)=='u')
			cnt_vow++;
			else
				cnt_cons++;
		}
		System.out.printf("There are %d Vowels\n",cnt_vow);
		System.out.printf("There are %d Consonants",cnt_cons);

	}

}
