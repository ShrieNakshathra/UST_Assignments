package com;

import java.util.HashMap;

public class Assignment_8 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ravi");
        employees.put(102, "Anita");

        System.out.println("Employee 101: " + employees.get(101));
    }
}

