package com;

import java.util.ArrayList;
import java.util.List;

public class AppLogic {

    // Example 1
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    // Example 2
    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    // Example 3
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Example 4
    public boolean isValidEmail(String email) {
        return email.contains("@");
    }

    // Example 5
    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    // Example 6
    public boolean isCSVFile(String fileName) {
        return fileName.endsWith(".csv");
    }

    // Example 7
    public String getUsername() {
        return "User";
    }

    // Example 8
    public int getListSize() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        return list.size();
    }

    // Example 9
    public boolean containsValue(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    // Example 10
    public void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    // Example 11
    public String greetUser(String name) {
        return "Welcome, " + name;
    }

    // Example 12
    public boolean isUserActive() {
        return true;
    }

    // Example 13
    public int countCharacters(String str) {
        return str.length();
    }

    // Example 14
    public String getCountryCode() {
        return "IN";
    }

    // Example 15
    public boolean isDataPresent() {
        return true;
    }
}
