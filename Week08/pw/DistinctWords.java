import java.io.*;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueWords = new LinkedHashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                uniqueWords.add(word);
            }
        }
        reader.close();
        System.out.println(uniqueWords);
    }
}
