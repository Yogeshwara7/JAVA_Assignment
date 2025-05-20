/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/


public class StringOper {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String firstName = "Yogesh";
        String lastName = "Wara";
        System.out.println("1. String Creation:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        // 2. Length and Character Access
        System.out.println("2. Length and Character Access:");
        System.out.println("Length of firstName: " + firstName.length());
        System.out.println("Character at index 2 in firstName: " + firstName.charAt(2));

        // 3. String Comparison
        String alias = "yogesh";
        System.out.println("3. String Comparison:");
        System.out.println("firstName.equals(alias): " + firstName.equals(alias));
        System.out.println("firstName.equalsIgnoreCase(alias): " + firstName.equalsIgnoreCase(alias));
        System.out.println("firstName.compareTo(lastName): " + firstName.compareTo(lastName));

        // 4. String Searching
        System.out.println("4. String Searching:");
        String sentence = "Welcome to AIET, the hub of innovation!";
        System.out.println("Sentence: " + sentence);
        System.out.println("Index of 'AIET': " + sentence.indexOf("AIET"));
        System.out.println("Contains 'innovation': " + sentence.contains("innovation"));

        // 5. Substring Operations
        System.out.println("5. Substring Operations:");
        System.out.println("Substring (11 to 15): " + sentence.substring(11, 15));

        // 6. String Modification
        System.out.println("6. String Modification:");
        System.out.println("Replace 'AIET' with 'MIT': " + sentence.replace("AIET", "MIT"));
        System.out.println("To Uppercase: " + firstName.toUpperCase());
        System.out.println("To Lowercase: " + lastName.toLowerCase());

        // 7. Whitespace Handling
        System.out.println("7. Whitespace Handling:");
        String padded = "   Learn Java Now!   ";
        System.out.println("Before trim: '" + padded + "'");
        System.out.println("After trim: '" + padded.trim() + "'");

        // 8. String Concatenation
        System.out.println("8. String Concatenation:");
        String fullName = firstName + " " + lastName;
        System.out.println("Concatenated String: " + fullName);
        System.out.println("Using concat(): " + firstName.concat(" ").concat(lastName));

        // 9. String Splitting
        System.out.println("9. String Splitting:");
        String subjects = "Maths,Physics,Chemistry,Biology";
        String[] subjectArray = subjects.split(",");
        for (String subject : subjectArray) {
            System.out.println(subject);
        }

        // 10. StringBuilder Demo
        System.out.println("10. StringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Engineering");
        sb.append(" College");
        sb.insert(0, "Welcome to ");
        sb.replace(11, 22, "AIET Campus");
        sb.reverse();
        System.out.println("StringBuilder result: " + sb.reverse());

        // 11. String Formatting
        System.out.println("11. String Formatting:");
        String dept = "CSE";
        int year = 2025;
        System.out.println(String.format("Department: %s, Graduation Year: %d", dept, year));

        // 12. Validate Email using contains(), startsWith(), endsWith()
        System.out.println("12. Validate Email:");
        String email = "yogeshwara@aiet.edu.in";
        boolean isValid = email.contains("@") && email.endsWith(".edu.in") && email.indexOf("@") > 0;
        System.out.println("Email: " + email);
        System.out.println("Starts with 'yogeshwara': " + email.startsWith("yogeshwara"));
        System.out.println("Ends with '.edu.in': " + email.endsWith(".edu.in"));
        System.out.println("Valid email? " + isValid);
    }
}
