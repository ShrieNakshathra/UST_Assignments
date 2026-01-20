package inheritance;

public class Main {

	
public static void main(String[] args) {
	
	Student s1=new Student();
	s1.setName("akash");
	s1.setAge(22);
	s1.setRollNo(101);
	s1.displayDetails();
	//Assign_2
	Car c1=new Car();
	c1.setbrand("Mahendra");
	c1.setSpeed(200);
	c1.display();
	//Assign_3
	Dog d1=new Dog();
	d1.bark();
	d1.eat();
	//Assign_4
	Manager m1=new Manager();
	m1.setsalary(50000);
	m1.setbonus(10000);
	m1.totalsalary();
	//Assign_5
	Savings_Acc sav_acc1=new Savings_Acc();
	sav_acc1.set_int_rate(4);
double interest=sav_acc1.calc_int(20000);
	System.out.println("Interest Amount: "+ interest);
	//Assign_6
	Student s2=new Student();
	s2.displayDetails();
}

}
