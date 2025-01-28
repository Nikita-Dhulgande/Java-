import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOperationsExample {

    public static void main(String[] args) {
        // Step 1: Create a list and add elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Print the original list
        System.out.println("Original List: " + numbers);

        // Step 2: Iterate over the list using Iterator
        System.out.println("Iterating through the list:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number); // Print each element
        }

        // Step 3: Remove even numbers from the list using Iterator
        iterator = numbers.iterator(); // Reset iterator
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove(); // Remove even numbers
            }
        }

        // Step 4: Print the modified list after removal
        System.out.println("List after removing even numbers: " + numbers);
    }
}
