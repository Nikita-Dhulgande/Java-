import java.io.*;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e);
        }
    }
}
