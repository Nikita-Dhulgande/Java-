

public class StringExample {
    public static void main(String[] args) {
        
        // String str2 = new String("World"); // Using the 'new' keyword

        String str = "  Hello, Java!  ";  //String Literal
        String str2= "Hello, Java";
        
        // Length of the string
        System.out.println("Length: " + str.length());

        // Trim spaces
        System.out.println("Trimmed String: '" + str.trim() + "'");

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Substring
        System.out.println("Substring: " + str.substring(8, 12)); // Output: "Java"

        // Check equality
        System.out.println("Equals 'HELLO, JAVA!': " + str.trim().equalsIgnoreCase("HELLO, JAVA!"));

        System.out.println(str.equals(str2));

        System.out.println(str.replace(o,u));
    }
    
}
