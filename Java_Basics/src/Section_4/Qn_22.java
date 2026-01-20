package Section_4;

import java.util.Scanner;

public class Qn_22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("The sum is: "+sum);
		System.out.println("Average is: "+avg);
		

	}

}
