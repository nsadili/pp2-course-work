import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DistinctWords {
    public static void main(String[] args) {
        
        //File file = new File("name.txt");
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> nameHashSet = new LinkedHashSet<>();

        while (scanner.hasNext()) {
            nameHashSet.add(scanner.next());
        }

        ArrayList<String> arrayList = new ArrayList<>(nameHashSet);
        Collections.sort(arrayList);

        System.out.println(arrayList.toString());

    }
}
