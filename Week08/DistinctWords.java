package Week08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        
        File file = new File("names.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        Set<String> distinctWords = null;
        if (args.length > 0 && args[0].equalsIgnoreCase("sorted")) {
            
            distinctWords = new TreeSet<>();
        } else {
            
            distinctWords = new LinkedHashSet<>();
        }

        
        while (scanner.hasNext()) {
            String word = scanner.next();
            distinctWords.add(word);
        }

        
        for (String word : distinctWords) {
            System.out.println(word);
        }
    }
}


