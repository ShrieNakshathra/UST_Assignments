package Object_Class_Constructors;

public class Book {
int bookId;
String title;
double price;
//Default Constructor
	Book(){
		bookId=1;
		title="Java Basics";
		price=800.0;
	}
	//Parameterized Constructor
	Book(int bookId,String title,double price){
		this.bookId=bookId;
		this.title=title;
		this.price=price;
	}
	void display() {
		System.out.println("BookId is: "+bookId);
		System.out.println("Title is: "+title);
		System.out.println("Price of Book is: "+price);
	}
	
}
