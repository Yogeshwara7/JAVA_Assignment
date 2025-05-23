/*  Q1. Write a Java Program for checking if a given string is null or contains only whitespace
using user-defined function isNullOrEmpty().*/

public class q1nullorEmpty{

    // Function to check if the input string is null or empty after trimming
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = null;
        String test2 = "     ";
        String test3 = "Hello";

        System.out.println("Test 1 (null): " + isNullOrEmpty(test1));   // true
        System.out.println("Test 2 (spaces): " + isNullOrEmpty(test2)); // true
        System.out.println("Test 3 ('Hello'): " + isNullOrEmpty(test3)); // false
    }
}
