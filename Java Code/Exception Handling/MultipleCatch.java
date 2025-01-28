public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[5] = 10; // Throws ArrayIndexOutOfBoundsException
            int result = 10 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e);
        }
    }
}
