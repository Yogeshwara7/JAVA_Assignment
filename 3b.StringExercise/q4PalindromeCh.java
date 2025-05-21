public class PalindromeChecker {

    // User-defined function to check if a string is a palindrome (ignoring case and punctuation)
    public static boolean checkPalindrome(String text) {
        if (text == null) return false;

        // Remove non-alphanumeric characters and convert to lowercase
        String filtered = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the filtered string
        String reversed = new StringBuilder(filtered).reverse().toString();

        // Compare original cleaned string with its reverse
        return filtered.equals(reversed);
    }

    public static void main(String[] args) {
        // Input string
        String testString = "A man, a plan, a canal, Panama";

        // Output results
        System.out.println("Original String: " + testString);
        System.out.println("Is Palindrome? " + checkPalindrome(testString));
    }
}
