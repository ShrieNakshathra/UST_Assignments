package Object_Class_Constructors;

public class Product {
int product_id;
String productName;
double price;

Product(int product_id,String productName,double price){
	this.product_id=product_id;
	this.productName=productName;
	this.price=price;	
}
void product_info() {
	System.out.println("Product id is: "+product_id);
	System.out.println("Product Name is: "+productName);
	System.out.println("price is: "+price);
}
}
