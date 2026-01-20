package Section_4;

import java.util.Scanner;

public class Qn_24 {
	public static void main(String[]args) {
		//Count Even and odd nos in array
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int cnt_odd=0,cnt_even=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
				cnt_even++;
			else
				cnt_odd++;
		}
		System.out.printf("There are %d Even numbers\n",cnt_even);
		System.out.printf("There are %d Odd numbers",cnt_odd);
}
}
