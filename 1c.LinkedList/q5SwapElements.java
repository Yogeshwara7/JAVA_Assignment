/*5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2)) */



import java.util.LinkedList;
import java.util.Collections;

public class q5SwapElements {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruit names to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Display the list before swapping
        System.out.println("Before swap: " + fruits);

        // Swap the first and third elements (index 0 and 2)
        Collections.swap(fruits, 0, 2);

        // Display the list after swapping
        System.out.println("After swap (1st and 3rd): " + fruits);
    }
}
