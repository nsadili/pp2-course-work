package Week08;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        List<String> distinctWords = new ArrayList<>();

        for (String word : words) {
            if (!distinctWords.contains(word)) {
                distinctWords.add(word);
            }
        }

        System.out.println("Distinct words in the sentence: " + distinctWords);

        // Retain order of the words
        Set<String> setDistinctWords = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println("Distinct words: " + setDistinctWords);

        // Order words alphabetically
        Set<String> setAlphabeticallyDistinctWords = new TreeSet<>(Arrays.asList(words));
        System.out.println("Words in alphabetical order: " + setAlphabeticallyDistinctWords);
        scanner.close();
    }
}


