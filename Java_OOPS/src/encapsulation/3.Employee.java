package encapsulation;

public class Employee {
private int empid;
private double salary;

public void setEmpid(int empid) {
	this.empid = empid;
}

public void setSalary(double salary) {
	
	if(salary<0) {
		this.salary=20000;//Setting default salary
	}
	else {
		this.salary = salary;
	}
}
public void display() {
	System.out.println("Emp id is: "+empid);
	System.out.println("Salary is: "+salary);
}

}
