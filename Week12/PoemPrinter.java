package Week12;

import java.io.*;

public class PoemPrinter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading poem file: " + e.getMessage());
        }
    }
}
