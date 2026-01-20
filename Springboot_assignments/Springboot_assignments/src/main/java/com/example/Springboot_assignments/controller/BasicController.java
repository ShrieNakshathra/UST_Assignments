package com.example.Springboot_assignments.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Springboot_assignments.service.BasicService;

@RestController
public class BasicController {

    @Autowired
    BasicService service;

    // 1. Welcome Message
    @GetMapping("/welcome")
    public String welcome() {
        return service.welcomeMessage();
    }

    // 2. Addition
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // 3. Even or Odd
    @GetMapping("/evenodd/{num}")
    public String evenOdd(@PathVariable int num) {
        return service.evenOrOdd(num);
    }

    // 4. Age Category
    @GetMapping("/age/{age}")
    public String age(@PathVariable int age) {
        return service.ageCategory(age);
    }

    // 5. Grade
    @GetMapping("/grade/{marks}")
    public String grade(@PathVariable int marks) {
        return service.grade(marks);
    }

    // 6. Temperature Conversion
    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convert(@PathVariable double celsius) {
        return service.celsiusToFahrenheit(celsius);
    }

    // 7. Reverse String
    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return service.reverseString(text);
    }

    // 8. Palindrome
    @GetMapping("/palindrome/{word}")
    public String palindrome(@PathVariable String word) {
        return service.isPalindrome(word) ? "Palindrome" : "Not Palindrome";
    }

    // 9. Factorial
    @GetMapping("/factorial/{num}")
    public long factorial(@PathVariable int num) {
        return service.factorial(num);
    }

    // 10. Prime Check
    @GetMapping("/prime/{num}")
    public String prime(@PathVariable int num) {
        return service.isPrime(num) ? "Prime" : "Not Prime";
    }

    // 11. Discount
    @GetMapping("/discount")
    public double discount(@RequestParam double price, @RequestParam double discount) {
        return service.calculateDiscount(price, discount);
    }

    // 12. Login
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return service.login(username, password);
    }

    // 13. Simple Interest
    @GetMapping("/interest")
    public double interest(@RequestParam double p,
                           @RequestParam double r,
                           @RequestParam double t) {
        return service.simpleInterest(p, r, t);
    }

    // 14. Word Count
    @PostMapping("/wordcount")
    public int wordCount(@RequestBody String sentence) {
        return service.wordCount(sentence);
    }

    // 15. Maximum of Three Numbers
    @GetMapping("/max")
    public int max(@RequestParam int a,
                   @RequestParam int b,
                   @RequestParam int c) {
        return service.maxOfThree(a, b, c);
    }
}
