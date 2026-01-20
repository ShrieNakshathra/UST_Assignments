package polymorphism;

public class Area {

	public static int area(int side) {
		int sqr=side*side;
		return sqr;
	}
	public static int area(int len,int brd) {
		int rec=len*brd;
		return rec;
	}
	public static double area(double r) {
		double cir=3.14*r*r;
		return cir;
	}
	
	
}
