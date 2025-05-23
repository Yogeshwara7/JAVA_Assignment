/*
Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
*/


public class q5WhiteSpace {

    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "  Java   Programming\tis \nfun  ";
        System.out.println("Original: '" + input1 + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input1) + "'\n");

        // Example 2: Only spaces
        String input2 = "  Hello World  ";
        System.out.println("Original: '" + input2 + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input2) + "'\n");

        // Example 3: Tabs and newlines
        String input3 = "\tWhitespace\nshould\tbe\ngone";
        System.out.println("Original: '" + input3 + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input3) + "'\n");

        // Example 4: No whitespace
        String input4 = "NoWhiteSpaceHere";
        System.out.println("Original: '" + input4 + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input4) + "'");
    }
}
