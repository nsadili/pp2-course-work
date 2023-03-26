import java.io.*;
import java.util.*;

public class RemoveDuplicatesFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        Set<String> uniqueWords = new LinkedHashSet<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Original order:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);
        System.out.println("Alphabetical order:");
        for (String word : sortedWords) {
            System.out.print(word + " ");
        }
    }
}