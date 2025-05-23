/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list */



import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        List<String> carArrayList = new ArrayList<>();
        List<String> carLinkedList = new LinkedList<>();

        List<String> initialCars = Arrays.asList("Toyota", "Honda", "Ford");

        // 1. Adding elements
        carArrayList.addAll(initialCars);
        carLinkedList.addAll(initialCars);
        System.out.println("1. Added elements:");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 2. Adding element at specific index
        carArrayList.add(1, "BMW");
        carLinkedList.add(1, "BMW");
        System.out.println("2. Added 'BMW' at index 1:");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 3. Adding multiple elements
        List<String> moreCars = Arrays.asList("Audi", "Tesla");
        carArrayList.addAll(moreCars);
        carLinkedList.addAll(moreCars);
        System.out.println("3. Added more cars:");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 4. Accessing elements
        System.out.println("4. Element at index 2:");
        System.out.println("   ArrayList: " + carArrayList.get(2));
        System.out.println("   LinkedList: " + carLinkedList.get(2));
        // 5. Updating elements
        carArrayList.set(2, "Jeep");
        carLinkedList.set(2, "Jeep");
        System.out.println("5. Updated index 2 to 'Jeep':");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 6. Removing elements
        carArrayList.remove("Honda");
        carLinkedList.remove("Honda");
        System.out.println("6. Removed 'Honda':");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 7. Searching elements
        System.out.println("7. Searching for 'Ford':");
        System.out.println("   In ArrayList? " + carArrayList.contains("Ford"));
        System.out.println("   In LinkedList? " + carLinkedList.contains("Ford"));
        // 8. List size
        System.out.println("8. Size of lists:");
        System.out.println("   ArrayList size: " + carArrayList.size());
        System.out.println("   LinkedList size: " + carLinkedList.size());
        // 9. Iterating over list (for-each loop)
        System.out.println("9. Iterating using for-each loop:");
        System.out.print("   ArrayList: ");
        for (String car : carArrayList) System.out.print(car + " ");
        System.out.print("\n   LinkedList: ");
        for (String car : carLinkedList) System.out.print(car + " ");
        System.out.println();
        // 10. Using Iterator
        System.out.println("10. Iterating using Iterator:");
        System.out.print("   ArrayList: ");
        Iterator<String> arrIter = carArrayList.iterator();
        while (arrIter.hasNext()) System.out.print(arrIter.next() + " ");
        System.out.print("\n   LinkedList: ");
        Iterator<String> linkIter = carLinkedList.iterator();
        while (linkIter.hasNext()) System.out.print(linkIter.next() + " ");
        System.out.println();
        // 11. Sorting
        Collections.sort(carArrayList);
        Collections.sort(carLinkedList);
        System.out.println("11. Sorted lists:");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
        // 12. Sublist
        List<String> subArray = carArrayList.subList(1, 3);
        List<String> subLinked = carLinkedList.subList(1, 3);
        System.out.println("12. Sublist (index 1 to 3):");
        System.out.println("   ArrayList sublist: " + subArray);
        System.out.println("   LinkedList sublist: " + subLinked);
        // 13. Clearing the list
        carArrayList.clear();
        carLinkedList.clear();
        System.out.println("13. Cleared lists:");
        System.out.println("   ArrayList: " + carArrayList);
        System.out.println("   LinkedList: " + carLinkedList);
    }
}
