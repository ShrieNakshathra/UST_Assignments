package Object_Class_Constructors;

public class Employee {

	int empId;
	String empName;
	double salary;
	Employee(){
		empId=121;
		empName="Santhosh";
		salary=25000.0;
		
	}
	void display() {
		System.out.println("Employee ID is: "+empId);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Salary is: "+salary);
	}
}
