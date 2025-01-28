import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using FileWriter
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, File Handling in Java!");
            writer.close();
            System.out.println("File written successfully.");

            // Reading from a file using FileReader
            FileReader reader = new FileReader("example.txt");
            int character;
            System.out.println("Reading file contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Read character by character
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
