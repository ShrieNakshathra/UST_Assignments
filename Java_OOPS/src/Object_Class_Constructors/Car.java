package Object_Class_Constructors;

public class Car {
String brand;
int model;
Double price;

Car(String brand,int model,Double price){
	System.out.println("object created...with parameter");
	this.brand=brand;
	this.model=model;
	this.price=price;
}
void display() {
	System.out.println("Brand: "+brand);
	System.out.println("model is: "+model);
	System.out.println("price is: "+price);
}
}
