package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.Address;
import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");//// load the xml file 
		Employee emp1=(Employee)ac.getBean("employee");// id for Employee class...
		emp1.setId(100);
		emp1.setName("Visagan");
		emp1.setSalary(50000);
		Address add = emp1.getAdd();
		add.setCity("Bangalore");
		add.setState("Kar");
		emp1.setAdd(add);
		System.out.println(emp1);
		

	}

}
