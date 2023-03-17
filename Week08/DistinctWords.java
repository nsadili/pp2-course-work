import java.io.File;
import java.io.IOException;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) throws IOException {
        // Creating a File object for the names file
        File file = new File("names.txt");

        // Creating a Set to store the unique words in the file
        Set<String> uniqueWords = new LinkedHashSet<>();

        // Reading the contents of the file and adding each word to the Set
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                uniqueWords.add(word);
            }
        }

        // Printing the unique words in the order of insertion
        System.out.println("Unique words in the order of insertion:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

        // Sorting the words in alphabetical ascending order
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);

        // Printing the unique words in alphabetical ascending order
        System.out.println("\n\nUnique words in alphabetical ascending order:");
        for (String word : sortedWords) {
            System.out.print(word + " ");
        }
    }
}
