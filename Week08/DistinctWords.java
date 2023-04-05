package Week08;
import java.io.*;
import java.util.*;
// names.txt;
public class DistinctWords {
    public static void main(String[] args) throws IOException {
       
        
        List<String> list = new ArrayList<>();
        File file = new File("names.txt");
        Scanner sc = new Scanner(file); 
        
        while (sc.hasNext()) {
        list.add(sc.next());
        } 
        sc.close();
        Set<String> hs= new LinkedHashSet<String>(list); 
        List<String> sortedWords=new ArrayList<>(hs);
        Collections.sort(sortedWords);
        
        System.out.println(sortedWords);
     }
}
