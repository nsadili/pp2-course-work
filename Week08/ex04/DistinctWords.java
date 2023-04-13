package Week08.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DistinctWords {

    public static void main(String[] args) {
        List<String> words = readWordsFromFile("names.txt");
        System.out.println("Original list of words:");
        System.out.println(words);
        
        List<String> distinctWords = eliminateDuplicatesRetainOrder(words);
        System.out.println("\nDistinct words (retaining order):");
        System.out.println(distinctWords);
        
        List<String> sortedDistinctWords = sortAndEliminateDuplicates(distinctWords);
        System.out.println("\nDistinct words (sorted alphabetically):");
        System.out.println(sortedDistinctWords);
    }
    
    public static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
    
    public static List<String> eliminateDuplicatesRetainOrder(List<String> words) {
        Set<String> seen = new HashSet<>();
        List<String> distinctWords = new ArrayList<>();
        for (String word : words) {
            if (seen.add(word)) {
                distinctWords.add(word);
            }
        }
        return distinctWords;
    }
    
    public static List<String> sortAndEliminateDuplicates(List<String> words) {
        List<String> distinctWords = eliminateDuplicatesRetainOrder(words);
        Collections.sort(distinctWords);
        return distinctWords;
    }
}

