package inheritance;

public class Car extends Vehicle{
	private String brand;

public void setbrand(String brand) {
	this.brand =brand;
}
public void display() {
	System.out.println("Speed is: "+speed+" Km/h");
	System.out.println("Brand is: "+brand);
}
}
