package com;

import java.util.ArrayList;

public class Assignment_15 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Kumar");

        String[] array = names.toArray(new String[0]);

        for (String name : array) {
            System.out.println(name);
        }
    }
}
