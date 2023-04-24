package week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {

    public static void main(String[] args) {

        String text = "Hello";
        String filename = "myTextFile.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(text);
            System.out.println(filename);
        } catch (IOException e) {
            System.err.println(filename);
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(filename)) {
            StringBuilder sb = new StringBuilder();

            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            String fileContent1 = sb.toString();
            System.out.println(fileContent1);

            // Read file contents using read(char[]) method
            char[] buffer = new char[1024];
            sb = new StringBuilder();
            int n;
            while ((n = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, n);
            }
            String fileContent2 = sb.toString();
            System.out.println(fileContent2);

        } catch (IOException e) {
            System.err.println(filename);
            e.printStackTrace();
        }
    }

}
