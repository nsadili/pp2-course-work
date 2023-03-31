import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueWords {
    private static Map<String, Set<Character>> cache = new TreeMap<>();
    public static void main(String[] args) {
        testAWord("Hello world");
        testAWord("Elvin cutie");
        testAWord("Leyla happy bithday");
    }

    public static void testAWord(String word){
        System.out.println("Calculating and returning...");
        long s = System.nanoTime();
        var set = uniqueWords(word);
        System.out.println(set);
        long e = System.nanoTime();
        System.out.println("Time elapse " + (e - s));
    }

    public static Set<Character> uniqueWords(String str){
        if (cache.containsKey(str)){
            System.out.println("Returning from cache...");
            return cache.get(str);
        }
        Set<Character> set = new HashSet<>();
        for (char ch: str.toCharArray()){
            if (ch == ' ') continue;
            set.add(ch);
        }
        // add to the cache
        cache.put(str, set);
        return set;
    }
}
