package Week08;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        Set<String> uniqueWords = readUniqueWordsFromFile("file.txt");
        System.out.println(uniqueWords);
        
        Set<String> sortedWords = new TreeSet<>(uniqueWords);
        System.out.println(sortedWords);
    }

    static Set<String> readUniqueWordsFromFile(String filename) {
        Set<String> uniqueWords = new LinkedHashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    uniqueWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uniqueWords;
    }
}
