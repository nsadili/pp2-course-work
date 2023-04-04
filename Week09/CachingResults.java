import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class CachingResults
{
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static void main(String[] args)
    {
        String str = "Butterfly";
        List<Character> res = getUniqueChar(str);

        System.out.println("Unique Characters: " + res);

        res = getUniqueChar(str);
        System.out.println("Unique Characters: " + res);
    }

      public static List<Character> getUniqueChar(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Result from cache!");
            return cache.get(str);
        }
        List<Character> uniqueChar = new ArrayList<>();
        for (var i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!uniqueChar.contains(ch))
                uniqueChar.add(ch);
        }
        cache.put(str, uniqueChar);
        return uniqueChar;
    }
}