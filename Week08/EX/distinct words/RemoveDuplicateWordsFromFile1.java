import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWordsFromFile1 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            Set<String> words = new TreeSet<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
            System.out.println("Words without duplicates in alphabetical order:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
