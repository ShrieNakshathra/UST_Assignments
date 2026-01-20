package com;

import java.util.HashMap;
import java.util.Map;

public class Assignment_9 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
