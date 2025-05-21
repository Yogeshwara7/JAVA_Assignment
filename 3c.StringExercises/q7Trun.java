public class q7Trun {

    // User-defined function to truncate a string and add ellipsis
    public static String truncateString(String inputText, int maxLength) {
        if (inputText == null || inputText.length() <= maxLength) {
            return inputText;
        }

        // Too small to add "..." properly
        if (maxLength <= 3) {
            return inputText.substring(0, maxLength);
        }

        return inputText.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        // Test examples
        String[] testInputs = {
            "This is a very long sentence that needs to be shortened.",
            "Short sentence.",
            "Mid-size line for test.",
            "Hi",
            "",
            "Another test for edge cases when limit is very low"
        };

        int[] maxLengths = {25, 10, 15, 2, 5, 3};

        // Apply the truncateString() function to each example
        for (int i = 0; i < testInputs.length; i++) {
            String original = testInputs[i];
            int limit = maxLengths[i];
            String shortened = truncateString(original, limit);

            System.out.println("Original String: '" + original + "'");
            System.out.println("Max Length: " + limit);
            System.out.println("Truncated String: '" + shortened + "'\n");
        }
    }
}
