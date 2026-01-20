package Section_4;
import java.util.*;
public class Qn_23 {

	public static void main(String[]args) {
		//Largest and Smallest
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int lar=arr[0];
		int sma=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>lar)
				lar=arr[i];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<sma)
				sma=arr[i];
		}
		System.out.println(lar);
		System.out.println(sma);
		
	}
}
