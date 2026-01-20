package Section_4;
import java.util.*;
public class Qn_27 {

	public static void main(String[] args) {
		//Sort arr in ascending order
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//Arrays.sort(arr);
		  for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {

	                if (arr[j] > arr[j + 1]) {
	                    // swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
