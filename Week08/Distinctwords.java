import java.io.*;
import java.util.*;

public class Distinctwords {
    public static void main(String[] args) {
        try {
          
            File file = new File("names.txt");
            Scanner scanner = new Scanner(file);
            
   
            Set<String> words = new LinkedHashSet<>();
            
          
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineWords = line.split("\\s+");
                
                for (String word : lineWords) {
                    words.add(word);
                }
            }
            
          
            scanner.close();
            
       
            System.out.println("Distinct words in order:");
            for (String word : words) {
                System.out.println(word);
            }
            
         
            Set<String> alphabeticallyOrderedWords = new TreeSet<>(words);
            
         
            System.out.println("\nDistinct words in alphabetical order:");
            for (String word : alphabeticallyOrderedWords) {
                System.out.println(word);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
