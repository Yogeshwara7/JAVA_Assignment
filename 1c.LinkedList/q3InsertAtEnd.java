/*3.Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/


import java.util.LinkedList;

public class q3InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Orange");

        colors.offerLast("Pink");

        System.out.println("After inserting at end: " + colors);
    }
}