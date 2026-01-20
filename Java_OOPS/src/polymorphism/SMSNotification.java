package polymorphism;

public class SMSNotification extends Notification{
	@Override
	void send() {
		System.out.println("Sending SMS Notification");
	}
}
