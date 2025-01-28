import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial HashMap: " + map); // {1=Apple, 2=Banana, 3=Cherry}

        // Access a value using a key
        System.out.println("Value for key 2: " + map.get(2)); // Banana

        // Remove a key-value pair
        map.remove(2);
        System.out.println("After removing key 2: " + map); // {1=Apple, 3=Cherry}

        // Check if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1)); // true

        // Check if a value exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana")); // false

        // Iterate over keys
        System.out.println("Keys in the HashMap: " + map.keySet()); // [1, 3]

        // Iterate over values
        System.out.println("Values in the HashMap: " + map.values()); // [Apple, Cherry]

        // Iterate over key-value pairs
        System.out.println("Key-Value pairs:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size()); // 2

        // Clear the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map); // {}
        System.out.println("Is HashMap empty? " + map.isEmpty()); // true
    }
}