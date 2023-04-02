import java.io.*;
import java.util.*;

public class DistinctWords {

    public static void main(String[] args) throws IOException {

        // Step 1: Read the file and store words in a list
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                words.add(token);
            }
        }
        reader.close();

        // Step 2: Eliminate duplicates while preserving order
        Map<String, Integer> distinctWords = new LinkedHashMap<>();
        for (String word : words) {
            distinctWords.put(word, 1);
        }

        // Step 3: Order the distinct words alphabetically or by occurrence (optional)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sorting order: \n1. Alphabetical\n2. Occurrence\n");
        int order = sc.nextInt();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(distinctWords.entrySet());
        if (order == 1) {
            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e1.getKey().compareTo(e2.getKey());
                }
            });
        } else if (order == 2) {
            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e2.getValue().compareTo(e1.getValue());
                }
            });
        }

        // Step 4: Print the results
        System.out.println("Distinct words:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}