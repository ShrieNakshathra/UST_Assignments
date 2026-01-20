package encapsulation;

public class Main {

	public static void main(String[] args) {
		//Assign_1
		Student s1=new Student();
		s1.setId(121);
		s1.setName("Gowtham");
		System.out.println("Id is: "+s1.getId());
		System.out.println("Name is: "+s1.getName());
		System.out.println("------------------------");
		//Assign_2
		BankAcc acc1=new BankAcc();
		acc1.setAccNo(12345678129L);
		acc1.setBal(-400);
		System.out.println("Account Number is: "+acc1.getAccNo());
		System.out.println("Account Number is: "+acc1.getBal());
		BankAcc acc2=new BankAcc();
		acc2.setAccNo(98652040321L);
		acc2.setBal(40000);
		System.out.println("Account Number is: "+acc2.getAccNo());
		System.out.println("Account Number is: "+acc2.getBal());
		
		System.out.println("------------------------");
		//Assign_3
		Employee emp1=new Employee();
		emp1.setEmpid(123);
		emp1.setSalary(-40000);
		emp1.display();
		Employee emp2=new Employee();
		emp2.setEmpid(456);
		emp2.setSalary(40000);
		emp2.display();
		System.out.println("------------------------");
		//Assign_4
		Product p1=new Product();
		p1.setPrice(2000);
		p1.disp();
		Product p2=new Product();
		p2.setPrice(50);
		p2.disp();
		System.out.println("------------------------");
		//Assign_5
		User u1=new User();
		u1.setEmail("virat@gmail.com");
		u1.setPassword("virat12345");
		u1.display();
		User u2=new User();
		u2.setEmail("virat@gmail.com");
		u2.setPassword("virat12");
		u2.display();
		System.out.println("------------------------");
		//Assign_6
		Customer c=new Customer();
		c.setName("Dhoni");
		c.setAge(22);
		c.setAge(16);//Invalid not assigned
		System.out.println(c.getCustomerDetails());
		System.out.println("------------------------");
		//Assign_7
		Mobile m1=new Mobile();
		m1.setBrand("Vivo");
		m1.setPrice(15000);
		System.out.println("Brand: "+m1.getBrand());
		System.out.println("Mobile Price with GST "+m1.getPrice());
		System.out.println("------------------------");
		//Assign_8
		ATMAccount ac1=new ATMAccount();
		ac1.setPin(1234);
		ac1.setBalance(5000);
		ac1.withdraw(2000);
		System.out.println("Final Balance: " + ac1.getBalance());
		ac1.withdraw(4000);
		System.out.println("------------------------");
		//Assign_9
		Admission student=new Admission();
		student.setMarks(82);  // Internal processing assigns grade
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.getGrade());

        student.setMarks(45);  // Another student example
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("------------------------");
		//Assign_10
        Policy policy1= new Policy();

        policy1.setPolicyId("POL123");
        policy1.setPremium(25);  // Premium calculated internally

        System.out.println("Policy ID: " + policy1.getPolicyId());
        System.out.println("Premium: " + policy1.getPremium());
        Policy policy2= new Policy();

        policy2.setPolicyId("POL123");
        policy2.setPremium(25);  // Premium calculated internally

        System.out.println("Policy ID: " + policy2.getPolicyId());
        System.out.println("Premium: " + policy2.getPremium());
        System.out.println("------------------------");
		
        
	}

}
