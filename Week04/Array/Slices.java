package Week04.Array;

import java.util.*;

public class Slices {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            
            List<String> slices = new ArrayList<>();
            for (int i = 1; i < word.length(); i++) {
                String slice = word.substring(0, i) + " " + word.substring(i);
                slices.add(slice);
            }
            
            System.out.println("All possible slices:");
            for (String slice : slices) {
                System.out.println(slice);
            }
        }
    }
}
