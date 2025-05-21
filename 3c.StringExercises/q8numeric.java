/*
 * Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
 */

public class q8numeric {

    // User-defined function to check if a string contains only numeric characters
    public static boolean isNumericString(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.matches("\\d+"); // checks if all characters are digits
    }

    public static void main(String[] args) {
        // Example test cases
        String[] testInputs = {
            "123456",
            "00123",
            "123abc",
            "12 34",
            "",
            null,
            "9876543210",
            "12.34",
            "-123"
        };

        // Loop through test cases
        for (String input : testInputs) {
            System.out.println("Input String: '" + input + "'");
            if (isNumericString(input)) {
                System.out.println("✅ The string contains only numeric characters.\n");
            } else {
                System.out.println("❌ The string does NOT contain only numeric characters.\n");
            }
        }
    }
}
