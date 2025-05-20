public class StringOperation {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String greeting = "Goodbye";
        String place = "Universe";
        System.out.println("Original Strings: greeting = " + greeting + ", place = " + place);

        // 2. Length and Character Access
        System.out.println("Length of greeting: " + greeting.length());
        System.out.println("Character at index 2 in greeting: " + greeting.charAt(2));

        // 3. String Comparison
        String greetLower = "goodbye";
        System.out.println("greeting equals greetLower (case-sensitive): " + greeting.equals(greetLower));
        System.out.println("greeting equals greetLower (case-insensitive): " + greeting.equalsIgnoreCase(greetLower));

        // 4. String Searching
        String phrase = "Welcome to Python Programming!";
        System.out.println("Index of 'Python' in phrase: " + phrase.indexOf("Python"));
        System.out.println("Does phrase contain 'Java'? " + phrase.contains("Java"));

        // 5. Substring Operations
        String subPhrase = phrase.substring(11, 17); // "Python"
        System.out.println("Substring (11 to 17): " + subPhrase);

        // 6. String Modification
        String replacedPhrase = phrase.replace("Python", "Java");
        System.out.println("After replace: " + replacedPhrase);
        System.out.println("To upper case: " + greeting.toUpperCase());
        System.out.println("To lower case: " + place.toLowerCase());

        // 7. Whitespace Handling
        String spacedString = "  Hello World  ";
        System.out.println("Original with spaces: '" + spacedString + "'");
        System.out.println("Trimmed: '" + spacedString.trim() + "'");

        // 8. String Concatenation
        String combined = greeting + " " + place;
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String fruitsCSV = "Apple,Banana,Cherry";
        String[] fruits = fruitsCSV.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(0, "Hey! ");
        sb.replace(4, 7, "Bye");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int year = 2025;
        String city = "Metropolis";
        System.out.println(String.format("City: %s, Year: %d", city, year));

        // 12. Email Validation with contains(), startsWith(), endsWith()
        String email = "user@domain.org";
        boolean isValidEmail = email.contains("@") && email.startsWith("user") && email.endsWith(".org");
        System.out.println("Is '" + email + "' a valid email? " + isValidEmail);
    }
}
