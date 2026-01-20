package com;
import java.util.*;
public class Qn_37 {
	public static int maxi(int num1,int num2) {
		int maxi=Math.max(num1, num2);
		return maxi;
	}
	public static void main(String[] args) {
		//Max_two_nos
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println(maxi(num1,num2));

	}

}
