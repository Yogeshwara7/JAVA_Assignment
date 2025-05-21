/*6.Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteColor {
    public static void main(String[] args) {
        // 1. Initialize list via the List interface
        List<String> colors = new ArrayList<>(Arrays.asList(
            "Red", "Green", "Blue", "Yellow", "Black", "White", "Purple"
        ));
        System.out.println("1. Original colors: " + colors);

        // 2. Prompt user for the position to remove (1-based)
        Scanner scanner = new Scanner(System.in);
        System.out.print("2. Enter the 1-based position to delete (1–" + colors.size() + "): ");
        int pos = scanner.nextInt();
        scanner.close();

        // 3. Convert to 0-based index and remove if valid
        int idx = pos - 1;
        if (idx >= 0 && idx < colors.size()) {
            String removed = colors.remove(idx);
            System.out.println("3. Removed color: " + removed);
        } else {
            System.out.println("3. Invalid position. No removal performed.");
        }

        // 4. Display the updated list
        System.out.println("4. Updated colors: " + colors);
    }
}
