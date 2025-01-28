import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("Initial Vector: " + vector); // [Apple, Banana, Cherry]

        // Add an element at a specific index
        vector.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + vector); // [Apple, Mango, Banana, Cherry]

        // Access an element
        System.out.println("Element at index 2: " + vector.get(2)); // Banana

        // Remove an element by index
        vector.remove(2); // Removes "Banana"
        System.out.println("After removing element at index 2: " + vector); // [Apple, Mango, Cherry]

        // Check if an element exists
        System.out.println("Contains Cherry? " + vector.contains("Cherry")); // true

        // Get the size and capacity
        System.out.println("Size of Vector: " + vector.size()); // 3
        System.out.println("Capacity of Vector: " + vector.capacity()); // Default is 10, grows dynamically

        // Clear all elements
        vector.clear();
        System.out.println("After clearing the Vector: " + vector); // []
        System.out.println("Is Vector empty? " + vector.isEmpty()); // true
    }
}