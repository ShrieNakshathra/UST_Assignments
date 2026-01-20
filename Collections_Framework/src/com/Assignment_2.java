package com;

import java.util.ArrayList;

public class Assignment_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(2); // removes element at index 2 (30)

        System.out.println(numbers);
    }
}

