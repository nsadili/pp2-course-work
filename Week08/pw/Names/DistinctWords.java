import java.util.*;
import java.io.*;

public class DistinctWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("names.txt");
        Scanner sc = new Scanner(file);
        Set<String> names = new LinkedHashSet<>();
        // while(sc.hasNextLine()){
        //     String addedword=sc.nextLine();
        //     if(addedword.length()==0) continue;
        //     names.add(addedword);
        // }
        while(sc.hasNext()){
            names.add(sc.next());
        }
        List<String> nameList= new ArrayList<>(names);
        Collections.sort(nameList);
        sc.close();
        System.out.println(names);
        System.out.println(nameList);
        
    }
}
