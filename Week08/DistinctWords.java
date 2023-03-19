import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        String filename = "names.txt";

        LinkedHashSet<String> wordsSet = new LinkedHashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordsSet.add(word);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        TreeSet<String> sortedWordsSet = new TreeSet<>(wordsSet);

        for (String word : sortedWordsSet) {
            System.out.println(word);
        }
    }
}

