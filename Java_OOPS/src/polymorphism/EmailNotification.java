package polymorphism;

public class EmailNotification extends Notification {
	@Override
	void send() {
System.out.println("Sending Email Notification");
	}
}
