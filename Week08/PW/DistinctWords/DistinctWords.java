import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DistinctWords {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/names.txt"));
            HashSet<String> hs = new HashSet<>();
            while (sc.hasNext()) {
                String word = sc.next();
                hs.add(word);
            }
            sc.close();

            System.out.println("i. How to ensure that the order of the words are retained?");
            System.out.println(hs);

            System.out.println("ii. How about ordering them by default in alphabetically ascending order?");
            TreeSet tr = new TreeSet(hs);

            System.out.println(tr);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
