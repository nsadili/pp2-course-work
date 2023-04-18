package Week09.ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {

    private static Map<String, Set<Character>> cache = new HashMap<>();
    public static void main(String[] args) {
        TestAWord("Hello World");
        TestAWord("Name is:");
        TestAWord("Hello World");
        TestAWord("I will be back in seconds");
    }

    public static void TestAWord(String word) {
        long s = System.nanoTime();
        var set = UniqueCharacter(word);
        System.out.println(set);
        System.out.println(UniqueCharacter("Hello World"));
        long e = System.nanoTime();
        System.out.println("Time passed: " + (e - s));
    }

    public static Set<Character> UniqueCharacter(String str) {

        if (cache.containsKey(str)) {
            System.out.printf(" [%s] returning from Cache.......\n", str);
            return cache.get(str);
        }
        Set<Character> set = new HashSet<>();
        for(Character ch : str.toCharArray())
        set.add(ch);
        cache.put(str, set);
        System.out.printf(" [%s] Calculated and Returning the value.......", str);
        return set;
    }
}