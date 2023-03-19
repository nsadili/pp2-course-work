import java.util.*;
import java.io.*;

public class DistinctWords01 {

    public static void main(String[] args) throws IQExpection {
        
        File file = new File ("name.txt");
        Scanner scanner = new Scanner(file);
        List<String> wordlist= new ArrayList<>() ;

        while (scanner.hasNext()) {
            wordsList.add(scanner.next());

        }

        Set<String> distinctWords = new LinkedHashSet<> (wordsList);
        List<String> sortedWords = new Arraylist<> (distinctWords);
        Collections.sort(sortedWords);
        System.out.println(sortedWords);
    }
}