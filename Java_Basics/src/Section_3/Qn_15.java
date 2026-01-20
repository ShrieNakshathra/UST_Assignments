package Section_3;

import java.util.Scanner;

public class Qn_15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the table number: ");
	    int table_num=s.nextInt();
	    int num=1;
	    while(num<=10) {
	    	int res=num*table_num;
	    	System.out.printf("%d * %d = %d",num,table_num,res);
	    	System.out.println();
	    
	    	num++;
	    }
	    
	}

}
