package Week08.PW;
import java.util.*;
import java.io.*;



public class DistinctWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("name.txt");

        Scanner sc = new Scanner(file);

        Set<String> names = new LinkedHashSet<>();


        while(sc.hasNextLine()){
            names.add(sc.nextLine());
        }
        List<String> nameList= new ArrayList<>(names);
        Collections.sort(nameList);
        sc.close();

        System.out.println(names);

        System.out.println(nameList);
        
    }
}