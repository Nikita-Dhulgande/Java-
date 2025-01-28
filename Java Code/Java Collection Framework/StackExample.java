import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack); // [Apple, Banana, Cherry]

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek()); // Cherry

        // Pop an element from the stack
        String removedElement = stack.pop();
        System.out.println("Popped element: " + removedElement); // Cherry
        System.out.println("Stack after pop: " + stack); // [Apple, Banana]

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Search for an element
        int position = stack.search("Apple");
        System.out.println("Position of 'Apple' from top: " + position); // 2

        // Pop all elements to empty the stack
        stack.pop();
        stack.pop();
        System.out.println("Stack after emptying: " + stack); // []
        System.out.println("Is stack empty? " + stack.isEmpty()); // true
    }
}