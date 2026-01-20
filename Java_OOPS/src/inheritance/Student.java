package inheritance;

public class Student extends Person {
private int rollNo;
public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
}


public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Roll No: " + rollNo);
}
//Assign_6-->Constructor
Student(){
	super();
	this.rollNo=146;//Set_def_rollno
}


}
