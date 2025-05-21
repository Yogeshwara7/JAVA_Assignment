/*
 * Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
 */


public class q3StringReverser {

    // User-defined function to reverse a string
    public static String reverseText(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        // Original string
        String originalText = "Java Programming";

        // Call the reverseText() function
        String reversedText = reverseText(originalText);

        // Output
        System.out.println("Original String: " + originalText);
        System.out.println("Reversed String: " + reversedText);
    }
}
