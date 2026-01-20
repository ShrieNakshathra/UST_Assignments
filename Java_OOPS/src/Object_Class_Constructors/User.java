package Object_Class_Constructors;

public class User {

	String email;
	String password;
	User(String email){
		this.email=email;
		this.password = "Not Set";
	}
	User(String email,String password){
		this.email=email;
		this.password=password;
	}
	void display() {
		System.out.println("email id id: "+email);
		System.out.println("password is: "+password);
		
	}
}
