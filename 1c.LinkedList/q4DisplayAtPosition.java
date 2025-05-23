/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/


import java.util.LinkedList;

public class q4DisplayAtPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}