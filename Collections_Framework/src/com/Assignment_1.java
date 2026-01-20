package com;
import java.util.ArrayList;

public class Assignment_1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ravi");
        students.add("Anita");
        students.add("Kumar");
        students.add("Priya");
        students.add("Suresh");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
