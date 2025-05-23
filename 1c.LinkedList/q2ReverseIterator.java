/* Write a Java program to iterate a linked list in reverse order (using
   objlist.descendingIterator()) */


import java.util.LinkedList;
import java.util.Iterator;

public class q2ReverseIterator {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Cyan");
        colors.add("Magenta");
        colors.add("Teal");

        Iterator<String> descendingIterator = colors.descendingIterator();

        System.out.println("Reverse order iteration:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
