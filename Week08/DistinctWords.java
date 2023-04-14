import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctWords {

    public static void main(String[] args) throws IOException {
        // Open the file and read the words
        File file = new File("filename.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            words.add(word);
        }
        scanner.close();

        // Remove duplicates while retaining order
        Set<String> uniqueWords = new LinkedHashSet<>(words);

        // Option 1: Print the unique words in the original order
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

        // Option 2: Print the unique words in alphabetical order
        Set<String> sortedWords = new LinkedHashSet<>(words);
        sortedWords.addAll(uniqueWords);

        for (String word : sortedWords) {
            System.out.print(word + " ");
        }
    }
}

