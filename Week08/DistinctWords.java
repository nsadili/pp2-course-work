package Week08;
import java.io.*;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) throws Exception {
        File file=new File("/E:/pp2/Week08/file.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        List<String> words = new ArrayList<>();
        while (line != null) {
            words.addAll(Arrays.asList(line.split(" ")));
            line = reader.readLine();
        }
        reader.close();

      
        List<String> uniqueWords = new ArrayList<>(new LinkedHashSet<>(words));

 
        Collections.sort(uniqueWords);

       
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
