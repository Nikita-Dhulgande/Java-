import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Banana");
        linkedMap.put(3, "Cherry");
        System.out.println("Initial LinkedHashMap: " + linkedMap); // {1=Apple, 2=Banana, 3=Cherry}

        // Access a value using a key
        System.out.println("Value for key 2: " + linkedMap.get(2)); // Banana

        // Remove a key-value pair
        linkedMap.remove(2);
        System.out.println("After removing key 2: " + linkedMap); // {1=Apple, 3=Cherry}

        // Check if a key exists
        System.out.println("Contains key 1? " + linkedMap.containsKey(1)); // true

        // Check if a value exists
        System.out.println("Contains value 'Banana'? " + linkedMap.containsValue("Banana")); // false

        // Iterate over key-value pairs
        System.out.println("Key-Value pairs in insertion order:");
        for (var entry : linkedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear all entries
        linkedMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedMap); // {}
        System.out.println("Is LinkedHashMap empty? " + linkedMap.isEmpty()); // true
    }
}