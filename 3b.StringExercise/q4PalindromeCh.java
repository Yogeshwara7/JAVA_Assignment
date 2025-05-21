public class q4PalindromeCh {

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
        // Palindrome test case
        String testPalindrome = "A man, a plan, a canal, Panama";
        System.out.println("Original String: " + testPalindrome);
        System.out.println("Is Palindrome? " + checkPalindrome(testPalindrome));

        System.out.println();

        // Not a palindrome test case
        String testNonPalindrome = "Hello, World!";
        System.out.println("Original String: " + testNonPalindrome);
        System.out.println("Is Palindrome? " + checkPalindrome(testNonPalindrome));
    }
}
