package encapsulation;

public class User {
private String email;
private String password;

public void setEmail(String email) {
	this.email = email;
}

public void setPassword(String password) {
	if(password.length()>=8)
		this.password=password;
	else
		this.password="";
}
public void display() {
	System.out.println("Email is: "+email);
	if(password.length()>=8)
		System.out.println("Password is: "+password);
	else
		System.out.println("Password must be atleast above 8 characters");
}


}
