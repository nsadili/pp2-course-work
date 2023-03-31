import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.processing.SupportedOptions;

public class UniqueWords {

    private static Map<String, Set<Character>> cache = new TreeMap<>(); // TreeMap is faster that HashMap for getting data

    public static void main(String[] args) {

        testAWord("Hello World");
        testAWord("Hello");
        testAWord("World");
        testAWord("Hello World");
 
    }

    public static void testAWord(String word){
        long A=System.nanoTime();
        var set = uniqueWords(word);
        System.out.println(set);
        long B=System.nanoTime();
        System.out.println("TIME: "+ (B-A));
    }

    public static Set<Character> uniqueWords(String str){

        if(cache.containsKey(str)){
            System.out.printf("Returing...\n");
            return cache.get(str);
        }
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()){
            set.add(ch);

            cache.put(str, set);
        }
        System.out.printf("Calculated/Returning...\n");
        return set;
    }
}
