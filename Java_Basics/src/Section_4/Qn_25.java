package Section_4;
import java.util.*;
public class Qn_25 {

	public static void main(String[]args) {
		//reverse an array
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int st=0,end=n-1;
		while(st<=end) {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
		for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
	}
}
