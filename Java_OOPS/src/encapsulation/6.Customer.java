package encapsulation;

public class Customer {
private String name;
private int age;

public void setName(String name) {
	this.name = name;
}

public void setAge(int age) {
	if(age>=18) {
		this.age=age;
	}
	
}
public String getCustomerDetails() {
    return "Customer Name: " + name + ", Age: " + age;
}

}
