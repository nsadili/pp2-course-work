package Week09.pw7;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CachingResults {

    private static Map<String, Set<Character>> cache;

    static{
        cache = new TreeMap<>();
    }

    public static void main(String[] args) {
        System.out.println(uniqueWords("Hello world"));
        System.out.println(uniqueWords("My name is"));
        System.out.println(uniqueWords("Hello world"));
        System.out.println(uniqueWords("I will be back!"));
        System.out.println(uniqueWords("I will be back!"));
        System.out.println(uniqueWords("I will be back!"));
    }
    //why class contains code
    static public  Set<Character>  uniqueWords(String str){
        if (cache.containsKey(str)) {
            System.out.println("returning from cache");
            return cache.get(str);
        }
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        cache.put(str, set);
        return set;
    }
}
