import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (default: natural ordering)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(50);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        System.out.println("Initial PriorityQueue: " + pq); // [10, 30, 20, 50, 40]

        // Retrieve the head element using peek
        System.out.println("Head element (peek): " + pq.peek()); // 10

        // Remove and retrieve the head element using poll
        System.out.println("Removed head element (poll): " + pq.poll()); // 10
        System.out.println("PriorityQueue after poll: " + pq); // [20, 30, 40, 50]

        // Check if the PriorityQueue contains a specific element
        System.out.println("Contains 40? " + pq.contains(40)); // true

        // Remove a specific element
        pq.remove(40);
        System.out.println("After removing 40: " + pq); // [20, 30, 50]

        // Iterate over the elements (Note: order may not be sorted)
        System.out.println("Iterating over PriorityQueue:");
        for (Integer element : pq) {
            System.out.println(element);
        }

        // Clear the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq); // []
    }
}