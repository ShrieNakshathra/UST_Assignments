package encapsulation;

public class Mobile {
private String brand;
private double price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	double gst=price*0.18;
	return price+gst;
}
public void setPrice(double price) {
	this.price = price;
}

}
