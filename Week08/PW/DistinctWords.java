import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        File file = new File("names.txt");
        Set<String> uniqueNames = new LinkedHashSet<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                uniqueNames.add(name);
            }
            scanner.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found.");
        }

        SortedSet<String> sortedNames = new TreeSet<>(uniqueNames);

        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}
