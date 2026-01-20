package com;
import java.util.*;
public class Qn_38 {
public static int SI(int p,int n,int r) {
	int SI=(p*n*r)/100;
	return SI;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principal amount");
		int p=s.nextInt();
		System.out.println("Enter the No of years: ");
		int n=s.nextInt();
		System.out.println("Enter the rate of intrest: ");
		int r=s.nextInt();
		System.out.println("Simple Intrest is: "+SI(p,n,r));
		

	}

}
