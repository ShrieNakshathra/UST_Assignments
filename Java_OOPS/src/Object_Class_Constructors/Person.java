package Object_Class_Constructors;

public class Person {
String name;
int age;

	Person(String name){
		this.name=name;
		age=20;//default I set age as 20
	}
	Person(String name,int age){
		this(name);//using this() to chain constructors
		this.age=age;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
