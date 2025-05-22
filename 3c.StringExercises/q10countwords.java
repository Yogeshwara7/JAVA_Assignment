/*
 * Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
 */

 public class q10countwords {

    // User-defined function to count words in a string
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        // Test inputs
        String[] testInputs = {
            "  Java is a widely-used programming language.  ",
            "Hello World",
            "    Multiple     spaces should be ignored    ",
            "SingleWord",
            "",
            "   ",
            null
        };

        // Run tests
        for (String input : testInputs) {
            System.out.println("Input String: \"" + input + "\"");
            int count = countWords(input);
            System.out.println("Number of words: " + count + "\n");
        }
    }
}
