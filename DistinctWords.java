import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DistinctWords {
    public static void main(String[] args) throws IOException {
        // Read file name from command line argument
        String fileName = args[0];
        // Read words from file and store them in a list
        List<String> words = readWordsFromFile(fileName);
        // Remove duplicate words while preserving order
        List<String> distinctWords = removeDuplicates(words);
        // Print the distinct words
        System.out.println("Distinct words (in order of appearance): " + distinctWords);
        // Sort the distinct words alphabetically and print them
        Collections.sort(distinctWords);
        System.out.println("Distinct words (in alphabetical order): " + distinctWords);
    }

    /**
     * Reads words from a file and returns them as a list.
     */
    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }
        }
        return words;
    }

    /**
     * Removes duplicate words from a list while preserving order of appearance.
     */
    public static List<String> removeDuplicates(List<String> words) {
        Set<String> seen = new HashSet<>();
        List<String> distinctWords = new ArrayList<>();
        for (String word : words) {
            if (seen.add(word)) {
                distinctWords.add(word);
            }
        }
        return distinctWords;
    }
}
