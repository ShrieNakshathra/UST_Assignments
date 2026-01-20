package com;

import java.util.ArrayList;

public class Assignment_4 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Spring Boot");
        courses.add("SQL");
        courses.add("AWS");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}
