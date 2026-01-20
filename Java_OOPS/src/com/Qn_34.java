package com;
import java.util.*;
public class Qn_34 {
public static String odd_even(int num) {
	if(num%2==0) {
		return "Even";
	}
	else {
		return "Odd";
	}
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=odd_even(num);
		System.out.println(result);
	}

}
