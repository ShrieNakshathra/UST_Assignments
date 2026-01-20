package com;

import java.util.Scanner;

public class Qn_36 {
public static boolean prime(int num) {
	int flag=1;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0)
			flag=0;
	}
	if(flag==1) return true;
	else return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		Boolean res=prime(num);
		if(res==true)
		System.out.println("Given num is Prime Number");
		else
			System.out.println("Given num is Not a Prime Number");
			

	}

}
