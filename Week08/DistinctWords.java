package Week08;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) {
        File file = new File("names.txt");

        try {
            List<String> words = readDistinctWords(file);
            System.out.println("Distinct words (original order):");
            printWords(words);

            List<String> wordsSorted = sortWordsAlphabetically(words);
            System.out.println("\nDistinct words (alphabetically sorted):");
            printWords(wordsSorted);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }

    private static List<String> readDistinctWords(File file) throws FileNotFoundException {
        Set<String> distinctWords = new LinkedHashSet<>(); // Use LinkedHashSet to preserve order

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                distinctWords.add(word);
            }
        }

        return new ArrayList<>(distinctWords);
    }

    private static List<String> sortWordsAlphabetically(List<String> words) {
        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords);
        return sortedWords;
    }

    private static void printWords(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
