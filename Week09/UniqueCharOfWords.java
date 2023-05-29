import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharOfWords {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter 1 to exit");
            Map<String, List<Character>> cache = new HashMap<>();
            
     while(true){
            System.out.println("Input:");

            String test = scn.next();
            if(test.equals("0")) break;
            if(!(cache.containsKey(test))){
                cache.put(test, findUniqe(test));
                System.out.println(" ");
                System.out.println(findUniqe(test));
            }
            else{
                System.out.println("Call from Cache");
                System.out.println(cache.get(test));
            }
      
         }
    }
}
    static List<Character> findUniqe(String test){
        
        List<Character> uniqueList = new ArrayList<>();
        List<Character> nonUniqe = new ArrayList<>();

        for(var ch : test.toCharArray()){
           if(!(uniqueList.contains(ch))) uniqueList.add(ch);
            else{
                nonUniqe.add(ch);
            }
        }
        uniqueList.removeAll(nonUniqe);

    return uniqueList;
    }
}