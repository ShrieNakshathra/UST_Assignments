package polymorphism;

public class Login {

	public static void login(String email) {
		System.out.println("Login with email: "+email);
	}
public static void  login(String email,String password) {
		System.out.printf("Loginn with email: %s and password: %s",email,password);
	}
	
}
