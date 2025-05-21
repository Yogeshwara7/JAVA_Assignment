/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) */

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator2nd {
    public static void main(String[] args) {
        // 1. Initialize LinkedList with color names
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // 2. Create ListIterator starting from 2nd element (index 1)
        ListIterator<String> iterator = colors.listIterator(1);

        // 3. Iterate from the 2nd element onward
        System.out.println("Colors from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

