package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {
    private static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String str) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        Set<Character> uniqueChars = new HashSet<>();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                result.add(c);
            }
        }
        cache.put(str, result);
        return result;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "world";
        String input3 = "goodbye";

        System.out.println(getUniqueCharacters(input1)); 
        System.out.println(getUniqueCharacters(input2)); 
        System.out.println(getUniqueCharacters(input3)); 
    }
}


