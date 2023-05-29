import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingWords {
    public static int countWords(String filePath) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");

                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        int wordCount = countWords(filePath);
        System.out.println("Total word count: " + wordCount);
    }
}