import java.util.ArrayList;
import java.util.Arrays;

public class SearchColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
            "Blue", "Green", "Red", "Yellow", "Black", 
            "White", "Purple", "Orange", "Pink"
        ));

        ArrayList<String> colors1 = new ArrayList<>(Arrays.asList(
            "Blue", "Green", "Golden", "Yellow", "Black", 
            "White", "Purple", "Orange", "Pink"
        ));

        System.out.println("Color List 1: " + colors);
        System.out.println("Color List 2: " + colors1);

        System.out.println(colors.contains("Red") 
            ? "'Red' is available in List 1." 
            : "'Red' is NOT available in List 1.");
        System.out.println(colors1.contains("Red") 
            ? "'Red' is available in List 2." 
            : "'Red' is NOT available in List 2.");
    }
}
