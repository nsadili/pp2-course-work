
import java.util.*;

import java.io.*;



public class Words {
    public static void main(String[] args){

    
    File file = new File("names.txt");
    try (Scanner sc = new Scanner(file)) {
        ArrayList<String> namesList = new ArrayList<String>();
        while (sc.hasNext()){
        String word = sc.next();
                namesList.add(word);
        } 
        System.out.println(namesList);

        Set<String> distinctWords = new LinkedHashSet<>(namesList);
        System.out.println(distinctWords);

        List<String> sortedWords = new ArrayList<>(distinctWords);
        Collections.sort(sortedWords);

        System.out.println(sortedWords);
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  
}
}
