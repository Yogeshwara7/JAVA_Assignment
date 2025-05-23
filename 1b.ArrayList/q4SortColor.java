/*4. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj) */


import java.util.ArrayList;
import java.util.Collections;

public class q4SortColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Maroon");
        colors.add("Cyan");
        colors.add("Turquoise");
        colors.add("Amber");

        Collections.sort(colors);

        System.out.println("Sorted color list: " + colors);
    }
}
