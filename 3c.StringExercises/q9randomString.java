/*
 * Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
 */

import java.util.Random;

public class q9randomString {

    // User-defined function to generate a random string of given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder randomText = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomText.append(characters.charAt(index));
        }

        return randomText.toString();
    }

    public static void main(String[] args) {
        // Example lengths for random strings
        int[] testLengths = {5, 8, 12, 0, 1, 20};

        // Generate and print random strings for each length
        for (int length : testLengths) {
            String randomString = generateRandomString(length);
            System.out.println("Generated Random String (" + length + " characters): " + randomString);
        }
    }
}
