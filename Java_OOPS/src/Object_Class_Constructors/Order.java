package Object_Class_Constructors;

public class Order {
	   int orderId;
	    String customerName;
	    double amount;
	    double tax;
	    double totalAmount;

	    // Constructor with orderId and customerName
	    Order(int orderId, String customerName) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.amount = 0;
	        calculateTax();
	    }

	    // Constructor with all details
	    Order(int orderId, String customerName, double amount) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.amount = amount;
	        calculateTax();
	    }

	    // Business logic method
	    void calculateTax() {
	        tax = amount * 0.10; // 10% tax
	        totalAmount = amount + tax;
	    }

	    void displayOrder() {
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Amount: " + amount);
	        System.out.println("Tax: " + tax);
	        System.out.println("Total Amount: " + totalAmount);
	        System.out.println("----------------------");
	    }
}
