package inheritance;
import java.util.*;
public class Person {
 protected String name;
 protected int age;
public void setName(String name) {
    this.name = name;
}

// Setter for age
public void setAge(int age) {
    this.age = age;
}
//Assign_6-->Constructor
Person(){
	this.name="Klasan";//Set_def_name
	this.age=20;
}

}
