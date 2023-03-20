import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pw1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("TextFile.txt");
        Scanner scanner = new Scanner(file);

        Set<String> names = new HashSet<>();

        Collections.addAll(names, "Laman", "Samir", "Araz", "Laman", "Araz", "Namaz", "Rasul", "Rasul");

        System.out.println(names);

      //  System.out.println(file);


        SortedSet<String> newNames = new TreeSet<>(names); 

        Collections.addAll(newNames, "Laman", "Samir", "Araz", "Laman", "Araz", "Namaz", "Rasul", "Rasul");

        System.out.println(newNames);                  
            
        
    }
}
