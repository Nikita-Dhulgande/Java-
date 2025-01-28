package String;

public class StringBuilderExam {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append
        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        // Replace
        sb.replace(0, 4, "Python");
        System.out.println("After Replace: " + sb);

        // Delete
        sb.delete(7, 18);
        System.out.println("After Delete: " + sb);
    }
    
}
