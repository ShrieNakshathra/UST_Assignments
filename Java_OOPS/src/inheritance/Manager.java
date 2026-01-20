package inheritance;

public class Manager extends Employee {
private double bonus;
private double total;
public void setbonus(double bonus) {
	this.bonus=bonus;
}
public  void totalsalary() {
	total=salary+bonus;
	System.out.println("Total Salary is: "+total);
}
}
