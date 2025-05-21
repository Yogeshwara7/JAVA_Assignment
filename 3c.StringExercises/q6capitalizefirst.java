/*
 * Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()
 */

public class q6capitalizefirst {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                capitalized.append(word.substring(1).toLowerCase()).append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testInputs = {
            "java programming is fun",
            "HELLO world JAVA",
            "   capitalize   each   word  ",
            "",
            "multiple\twords with\ttabs",
            "one"
        };

        // Apply the function to each input and print the result
        for (String input : testInputs) {
            System.out.println("Original String: '" + input + "'");
            System.out.println("Capitalized String: '" + capitalizeWords(input) + "'\n");
        }
    }
}
