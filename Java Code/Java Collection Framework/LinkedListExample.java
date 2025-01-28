import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list); // [Apple, Banana, Cherry]

        // Add elements at specific positions
        list.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + list); // [Apple, Mango, Banana, Cherry]

        // Access elements
        System.out.println("Element at index 2: " + list.get(2)); // Banana

        // Remove elements
        list.remove(2); // Removes "Banana"
        System.out.println("After removing element at index 2: " + list); // [Apple, Mango, Cherry]

        // Add elements to the beginning and end
        list.addFirst("Pineapple");
        list.addLast("Orange");
        System.out.println("After adding Pineapple and Orange: " + list); // [Pineapple, Apple, Mango, Cherry, Orange]

        // Remove first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last elements: " + list); // [Apple, Mango, Cherry]

        // Retrieve first and last elements
        System.out.println("First Element: " + list.getFirst()); // Apple
        System.out.println("Last Element: " + list.getLast()); // Cherry

        // Size of the LinkedList
        System.out.println("Size of the LinkedList: " + list.size()); // 3
    }
}