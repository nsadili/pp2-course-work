package pw;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    Set<String> uniqueWords= new TreeSet<>();
    while(scan.hasNext()){
    uniqueWords.add(scan.next());
    }
    System.out.println(uniqueWords);
}
}
