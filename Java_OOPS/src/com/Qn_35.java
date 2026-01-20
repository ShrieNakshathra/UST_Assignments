package com;
import java.util.*;
public class Qn_35 {
	public static int fact(int num) {
		int number=num;
		int fact=1;
		while(num>=1) {
			fact*=num;
			num--;
		}
		
		return fact;
		
	}
	public static void main(String[] args) {
		//Factorial of number
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(fact(num));
	}

}
