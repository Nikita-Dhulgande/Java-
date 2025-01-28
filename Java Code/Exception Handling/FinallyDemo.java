public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10; // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
