/*
 * Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
 */


public class q2count {

    // User-defined function to count occurrences of a substring
    public static int countMatches(String text, String keyword) {
        if (text == null || keyword == null || keyword.isEmpty()) {
            return 0;
        }

        int matchCount = 0;
        int currentIndex = 0;

        while ((currentIndex = text.indexOf(keyword, currentIndex)) != -1) {
            matchCount++;
            currentIndex += keyword.length(); // move past the found substring
        }

        return matchCount;
    }

    public static void main(String[] args) {
        // Input strings
        String fullText = "hello world, hello universe, hello Java";
        String searchWord = "hello";

        int result = countMatches(fullText, searchWord);
        System.out.println("The fullText: " + fullText);
        System.out.println("The word '" + searchWord + "' appears " + result + " times.");
    }
}
