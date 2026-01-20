package Object_Class_Constructors;

public class Main {
	
	public static void main(String args[]) {
	Student s1=new Student();

    s1.id = 101;
    s1.name = "Visagan";
	s1.displayDetails();
	
	//Assign_2
	Employee emp1=new Employee();
	emp1.display();
	
	//Assign_3
	Car c1=new Car("BMW",7,2000000.0);
	c1.display();
	Car c2=new Car("Swift",9,1500000.0);
	c2.display();
	
	//Assign_4
	Book b1=new Book();//Default Constructor
	b1.display();
	Book b2=new Book(101,"DSA",2000.0);//Parameterized Constructor
	b2.display();
	
	//Assign_5
	BankAccount acc1 = new BankAccount(123456, "Ragul", 25000.00);
	acc1.showAccount();
	
	//Assign_6
	Product p1=new Product(113,"Mobile",23000.0);
	p1.product_info();
	
	//Assign_7
	User u1=new User("visa@gmail.com");
	u1.display();
	User u2=new User("visa@gmail.com","visa@1206");
	u2.display();
	
	//Assign_8
	 Mobile m1 = new Mobile("Samsung");
     Mobile m2 = new Mobile("Realme", 6, 128);
     Mobile m3 = new Mobile("Apple", 8, 256, 79999);
	m1.display_config();
	m2.display_config();
	m3.display_config();
	
	//Assign_9
	LibraryBook book1 =new LibraryBook(101,"Java Programming","Herbert Schildt",true);
	 System.out.println("Book ID: " + book1.bookId);
     System.out.println("Title: " + book1.title);
     System.out.println("Author: " + book1.author);

     if (book1.isAvailable()) {
         System.out.println("Status: Available");
     } else {
         System.out.println("Status: Not Available");
     }
     
     //Assign_10
     StudentAdmission stud1 =new StudentAdmission();
     StudentAdmission stud2 = new StudentAdmission("Rakesh");
	stud1.displayAdmission();
	stud2.displayAdmission();
	
	//Assign_11-->Cons chaining
	Person per1=new Person("Virat");
	per1.display();
	Person per2=new Person("Kholi",35);
	per2.display();
	//Assign_12
	
	  Order o1 = new Order(1001, "Visagan");
      Order o2 = new Order(1002, "Arun", 5000);

      o1.displayOrder();
      o2.displayOrder();
}
}
