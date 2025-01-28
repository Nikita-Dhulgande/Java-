

public class StringBufferExam {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
    
}
