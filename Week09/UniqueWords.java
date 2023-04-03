import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueWords {
    private static Map<String, Set<Character>> cache = new TreeMap<>();

    public static void main(String[] args) {
        testAword("Hello World");
        testAword("My name is");
        testAword("Hello World");
        testAword("I will be back!");

    }

    public static void testAword(String word) {
        long s = System.nanoTime();
        var set = uniqueWords(word);
        System.out.println(set);
        long e = System.nanoTime();
        System.out.println("Time ellapsed: " + (e - s));
    }

    public static Set<Character> uniqueWords(String str) {

        if (cache.containsKey(str)) {
            System.out.printf("[%s] returning from cache...\n", str);
            return cache.get(str);
        }
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray())
            set.add(ch);

        // Add to the cache
        cache.put(str, set);

        System.out.printf("[%s] Calculated and returning...\n", str);

        return set;

    }


}
