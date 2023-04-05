import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachingResults {

    private static Map<String, List<Character>> cache = new HashMap<>();

    public static void main(String[] args) {
        String str = "Hello world";
        List<Character> res = getUniqueChar(str);
        System.out.println("Unique characters: " + res);

        res = getUniqueChar(str);
        System.out.println("Unique characters: " + res);
    }

    public static List<Character> getUniqueChar(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Result from cache!");
            return cache.get(str);
        }

        List<Character> uniqueChar = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueChar.contains(c)) {
                uniqueChar.add(c);
            }
        }
        cache.put(str, uniqueChar);
        return uniqueChar;
    }
}
