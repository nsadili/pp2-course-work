package Week08.PW;
import java.util.*;
import java.io.*;

public class DistinctWords {
    public static void main(String[] args) throws IOException {
        File file= new File("names.txt");
        Scanner scanner= new Scanner(file);

        List<String> wordsList= new ArrayList<>();
        while(scanner.hasNext()){
            wordsList.add(scanner.next());
        }
        System.out.println(wordsList);

        Set<String> distinctWords = new LinkedHashSet<>(wordsList);
        System.out.println(distinctWords);
        List<String> sortedwords = new ArrayList<>(distinctWords);
        Collections.sort(sortedwords);

        System.out.println(sortedwords);
        
    }  
}
