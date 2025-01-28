import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        System.out.println("Initial TreeMap: " + treeMap); // {1=Apple, 2=Banana, 3=Cherry}

        // Access a value using a key
        System.out.println("Value for key 2: " + treeMap.get(2)); // Banana

        // Remove a key-value pair
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap); // {1=Apple, 3=Cherry}

        // Get the first and last keys
        System.out.println("First key: " + treeMap.firstKey()); // 1
        System.out.println("Last key: " + treeMap.lastKey()); // 3

        // Check if a key exists
        System.out.println("Contains key 1? " + treeMap.containsKey(1)); // true

        // Check if a value exists
        System.out.println("Contains value 'Banana'? " + treeMap.containsValue("Banana")); // false

        // Get a subset of the map
        treeMap.put(4, "Date");
        System.out.println("SubMap (1 to 4): " + treeMap.subMap(1, 4)); // {1=Apple, 3=Cherry}

        // Iterate over key-value pairs
        System.out.println("Key-Value pairs in sorted order:");
        for (var entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap); // {}
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty()); // true
    }
}