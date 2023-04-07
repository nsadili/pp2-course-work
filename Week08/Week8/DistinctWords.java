package Week8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctWords {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("names.txt"))) {
            List<String> words = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    words.add(token);
                }
            }
            
            // Remove duplicates while preserving order
            List<String> distinctWords = words.stream().distinct().collect(Collectors.toList());
            
            // Print distinct words in original order
            System.out.println("Distinct words (in original order):");
            for (String word : distinctWords) {
                System.out.println(word);
            }
            
            // Sort distinct words in ascending alphabetical order
            Set<String> sortedDistinctWords = new LinkedHashSet<>(distinctWords);
            
            // Print distinct words in ascending alphabetical order
            System.out.println("\nDistinct words (in ascending alphabetical order):");
            for (String word : sortedDistinctWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
