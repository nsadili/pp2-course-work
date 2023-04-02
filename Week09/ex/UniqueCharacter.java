import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {

    private static Map<String, Set<Character>> cache = new HashMap<>();
    public static void main(String[] args) {
        // long s = System.nanoTime();
        
        // String str = "Hello World";

        // long e = System.nanoTime();
        // System.out.println("Time elapsed: " + (e - s));
        // //var res = UniqueCharacter(str);

        // s = System.nanoTime();
        // System.out.println(UniqueCharacter(str));

        // System.out.println(UniqueCharacter("Hello World"));
        // System.out.println(UniqueCharacter("My name is"));
        // System.out.println(UniqueCharacter("Hello World"));
        // System.out.println(UniqueCharacter("I will be back!"));

        TestAWord("Hello World");
        TestAWord("My name is");
        TestAWord("Hello World");
        TestAWord("I will be back");


    }

    public static void TestAWord(String word) {

        long s = System.nanoTime();
        var set = UniqueCharacter(word);
        System.out.println(set);
        
        System.out.println(UniqueCharacter("Hello World"));

        long e = System.nanoTime();
        System.out.println("Time elapsed: " + (e - s));
    }

    public static Set<Character> UniqueCharacter(String str) {

        if (cache.containsKey(str)) {
            System.out.printf(" [%s] returning from cache...\n", str);
            return cache.get(str);
        }
        
        Set<Character> set = new HashSet<>();

        for(Character ch : str.toCharArray())
        set.add(ch);

        cache.put(str, set);

        System.out.printf(" [%s] Calculated and returning...", str);
        return set;

    }
}
