import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("This is a line written using BufferedWriter.");
            writer.newLine(); // Add a new line
            writer.write("This is another line.");
            writer.close();
            System.out.println("File written successfully using BufferedWriter.");

            // Reading from a file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            System.out.println("Reading file contents using BufferedReader:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Read line by line
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
