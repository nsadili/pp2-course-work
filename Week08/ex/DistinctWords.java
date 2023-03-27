package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            String line = reader.readLine();
            while (line != null) {
                names.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        Set<String> uniqueNames = new LinkedHashSet<>(names);

        List<String> sortedNames = new ArrayList<>(uniqueNames);
        Collections.sort(sortedNames);

        System.out.println("Distinct names in alphabetical order:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}
