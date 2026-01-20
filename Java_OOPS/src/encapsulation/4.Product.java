package encapsulation;

public class Product {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	if(price>100 && price< 100000)
	this.price = price;
	else
		this.price = 100; 
}

public void disp() {
	if(price>100 && price< 100000)
		System.out.println("Product price is: "+price);
		else
			System.out.println("Setting Default values: "+price);
}

}
