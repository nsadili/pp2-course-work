package Week08.PW;


import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DistinctWords {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify a filepath.");
            return;
        }
        try {
            File f = new File(args[0]);
            Scanner sc = new Scanner(f);
            SortedSet<String> names = new TreeSet<String>();
            while (sc.hasNext()) names.add(sc.next());
            System.out.println(names);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
