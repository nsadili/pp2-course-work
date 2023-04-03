import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWordsFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            Set<String> words = new LinkedHashSet<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
            System.out.println("Words without duplicates:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
