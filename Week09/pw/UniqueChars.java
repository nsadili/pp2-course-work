import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueChars {
        private static Map<String, Set<Character>> cache = new TreeMap<>();
    
        public static void main(String[] args) {
            testAword("Hello World");
            testAword("Hello");
    
        }
    
        public static void testAword(String word) {
            long s = System.nanoTime();
            var set = uniqueChars(word);
            System.out.println(set);
            long e = System.nanoTime();
            System.out.println((e - s));
        }
    
        public static Set<Character> uniqueChars(String str) {
    
            if (cache.containsKey(str)) {
                System.out.printf("[%s] returning from cache \n", str);
                return cache.get(str);
            }
            Set<Character> set = new HashSet<>();
    
            for (char ch : str.toCharArray())
                set.add(ch);
    
            cache.put(str, set);
    
            System.out.printf("[%s]", str);
    
            return set;
    
        }
    
    
    }

