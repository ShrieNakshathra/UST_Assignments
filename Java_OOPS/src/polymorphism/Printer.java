package polymorphism;

public class Printer {
public static void print(int a) {
	System.out.println("Integer: "+a);
}
public static void print(String b) {
	System.out.println("String: "+b);
}
public static void print(int a,String b) {
	System.out.printf("Integer is %d and String is %s  ",a ,b);
}
}
