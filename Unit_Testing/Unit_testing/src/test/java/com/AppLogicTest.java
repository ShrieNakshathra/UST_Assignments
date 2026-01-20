package com;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppLogicTest {

    AppLogic logic = new AppLogic();

    // Example 1
    @Test
    public void testLoginSuccess() {
        assertTrue(logic.login("admin", "admin123"));
        assertFalse(logic.login("user", "123"));
    }

    // Example 2
    @Test
    public void testAgeEligibility() {
        assertTrue(logic.isEligibleToVote(18));
        assertFalse(logic.isEligibleToVote(16));
    }

    // Example 3
    @Test
    public void testUppercaseConversion() {
        assertEquals("JAVA", logic.toUpperCase("java"));
    }

    // Example 4
    @Test
    public void testEmailValidation() {
        assertTrue(logic.isValidEmail("test@gmail.com"));
    }

    // Example 5
    @Test
    public void testPasswordLength() {
        assertTrue(logic.isValidPassword("password1"));
        assertFalse(logic.isValidPassword("pass"));
    }

    // Example 6
    @Test
    public void testFileExtension() {
        assertTrue(logic.isCSVFile("data.csv"));
    }

    // Example 7
    @Test
    public void testNotNullUsername() {
        assertNotNull(logic.getUsername());
    }

    // Example 8
    @Test
    public void testListSize() {
        assertEquals(3, logic.getListSize());
    }

    // Example 9
    @Test
    public void testArrayContainsValue() {
        int[] arr = {1, 2, 3, 4};
        assertTrue(logic.containsValue(arr, 3));
    }

    // Example 10
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAgeException() {
        logic.checkAge(-5);
    }

    // Example 11
    @Test
    public void testGreetingMessage() {
        assertEquals("Welcome, User", logic.greetUser("User"));
    }

    // Example 12
    @Test
    public void testBooleanFlag() {
        assertTrue(logic.isUserActive());
    }

    // Example 13
    @Test
    public void testCharacterCount() {
        assertEquals(4, logic.countCharacters("Java"));
    }

    // Example 14
    @Test
    public void testDefaultCountryCode() {
        assertEquals("IN", logic.getCountryCode());
    }

    // Example 15
    @Test
    public void testDataPresentFlag() {
        assertTrue(logic.isDataPresent());
    }
}
