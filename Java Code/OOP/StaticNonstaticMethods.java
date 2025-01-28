class Calculator {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }

    // Non-static method
    int multiply(int a, int b) {
        return a * b;
    }
}

// Main program
public class StaticNonstaticMethods {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5, 3)); // Static method call, Output: 8
        
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(4, 2)); // Non-static method call, Output: 8
    }
}
