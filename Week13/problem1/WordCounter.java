import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt"; // replace with the name of your file
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > 3) {
                    count++;
                }
            }
        }
        reader.close();
        System.out.println("Total number of words: " + count);
    }
}
