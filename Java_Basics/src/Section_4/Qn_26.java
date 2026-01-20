package Section_4;

import java.util.Scanner;

public class Qn_26 {

	public static void main(String[] args) {
		//Linear Search
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the target element: ");
		int tar=s.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==tar) {
				System.out.printf("The target element %d is found at %d index position",tar,i);
				flag=1;
			}
				
		}
		if(flag==0) System.out.println("The target element is not found");
		
		

	}

}
