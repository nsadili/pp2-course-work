package EX;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        HashMap<String, LinkedHashSet<Character>> cache = new HashMap<String, LinkedHashSet<Character>>();

        long s = System.nanoTime();
        System.out.println(divChar("Hello world", cache));
        long e = System.nanoTime();
        System.out.println("Time taken: "+ (e-s));

        s= System.nanoTime();
        System.out.println(divChar("Hello world", cache));
        e = System.nanoTime();
        System.out.println("Time taken: "+ (e-s));
    }

    static HashSet<Character> divChar(String word, HashMap<String, LinkedHashSet<Character>> cache) {
        if (cache.containsKey(word)) {
            return cache.get(word);
        } else {
            LinkedHashSet<Character> chars = new LinkedHashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }
            cache.put(word, chars);
            return chars;
        }
    }

}
