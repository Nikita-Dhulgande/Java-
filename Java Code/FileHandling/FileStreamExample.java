import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        try {       
            // Writing binary data to a file
            FileOutputStream fos = new FileOutputStream("binaryfile.dat");
            fos.write(65); // Writes the ASCII value of 'A'
            fos.write(66); // Writes the ASCII value of 'B'
            fos.close();
            System.out.println("Binary file written successfully.");

            // Reading binary data from a file
            FileInputStream fis = new FileInputStream("binaryfile.dat");
            int data;
            System.out.println("Reading binary file contents:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert ASCII value to character
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
