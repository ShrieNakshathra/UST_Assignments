package Section_5;

public class Qn_32 {

	public static void main(String[] args) {
		  String str = "programming";
	        char[] ch = str.toCharArray();

	        System.out.println("Duplicate characters:");

	        for (int i = 0; i < ch.length; i++) {
	            int count = 1;

	            if (ch[i] == '0') continue;

	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                    ch[j] = '0'; // mark visited
	                }
	            }

	            if (count > 1 && ch[i] != ' ') {
	                System.out.println(ch[i] + " = " + count);
	            }
	        }
	}

}
