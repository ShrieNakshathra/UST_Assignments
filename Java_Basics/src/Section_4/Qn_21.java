package Section_4;
import java.util.*;
public class Qn_21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("The values are: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
