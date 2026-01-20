package polymorphism;

public class Main {
	
public static void main(String[] args) {
	//Overloading and Overriding
	//Assign_1
	Calc c1=new Calc();//Method_overloading
	System.out.println(c1.add(12, 26));
	System.out.println(c1.add(12, 26+31));
	System.out.println(c1.add(12.3, 26.8));
	//Assign_2
	Area a1=new Area();
	System.out.println("Area of sqr: "+a1.area(4));//Area_sqr
	System.out.println("Area of rec: "+a1.area(2,3));//Area_rec
	System.out.println("Area of circ: "+a1.area(5.0));//Area_circ
	//Assign_3
	Printer p1=new Printer();
	p1.print(23);
	p1.print("Normal_msg");
	p1.print(24,"Normal_msg");
	System.out.println();
	//Assign_4
	Login u1=new Login();
	u1.login("visa@gmail.com");
	u1.login("visa@gmail.com", "visa@1234");
	//Assign_5
	Payment pay1=new Payment();
	pay1.pay(20000);
	pay1.pay(10000,"Online");
	System.out.println();
	//Assign_6-->Overriding
	Shape s1=new Circle();
	Shape s2=new Rectangle();
	s1.draw();
	s2.draw();
	Shape s3=new Shape();
	s3.draw();
	//Assign_7
	
	Bank b1=new SBI();
	System.out.println("SBI interest is: "+b1.getInterestRate());
	Bank b2=new HDFC();
	System.out.println("HDFC interest is: "+b2.getInterestRate());
	Bank b3=new Bank();
	System.out.println("Default Bank initerst is: "+b3.getInterestRate());
	
	//Assign_8
	Notification email=new EmailNotification();
	Notification sms=new SMSNotification();
	email.send();
	sms.send();
	Notification notify=new Notification();
	notify.send();
	
	
	
}
}
