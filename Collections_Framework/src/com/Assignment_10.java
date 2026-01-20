package com;

import java.util.HashMap;

public class Assignment_10 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ravi");
        employees.put(102, "Anita");
        employees.put(103, "Kumar");

        employees.remove(102);

        System.out.println(employees);
    }
}
