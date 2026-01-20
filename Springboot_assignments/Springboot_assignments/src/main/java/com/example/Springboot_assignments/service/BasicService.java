package com.example.Springboot_assignments.service;



import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public String welcomeMessage() {
        return "Welcome to Spring Boot REST API";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public String ageCategory(int age) {
        if (age < 18) return "Child";
        else if (age < 60) return "Adult";
        else return "Senior Citizen";
    }

    public String grade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public double calculateDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }

    public String login(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password))
            return "Login Successful";
        else
            return "Login Failed";
    }

    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public int wordCount(String sentence) {
        return sentence.trim().split("\\s+").length;
    }

    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

