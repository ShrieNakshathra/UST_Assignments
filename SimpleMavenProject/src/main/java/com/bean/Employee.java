package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component				//No need xml--><bean class="com.bean.Employee"></bean> by default class name in lower case ie camelNaming rule 
@Scope("prototype")
public class Employee {// employee if class two words then employeeDetails
@Value(value="123")
private int id;
private String name;
private float salary;
@Autowired			//byType
private Address add;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}

	
public Employee() {
	super();
}
public Employee(int id, String name, float salary, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}
