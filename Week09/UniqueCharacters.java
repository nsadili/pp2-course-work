package Week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {
    private Map<String, List<Character>> cache;

    public UniqueCharacters() {
        cache = new HashMap<>();
    }

    public List<Character> getUniqueCharacters(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Retrieving from cache...");
            return cache.get(str);
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        cache.put(str, uniqueChars);
        return uniqueChars;
    }

    public static void main(String[] args) {
        UniqueCharacters uc = new UniqueCharacters();
    
        String str1 = "hello world";
        List<Character> uniqueChars1 = uc.getUniqueCharacters(str1);
        System.out.println("Unique characters of " + str1 + ": " + uniqueChars1);
    
        String str2 = "programming";
        List<Character> uniqueChars2 = uc.getUniqueCharacters(str2);
        System.out.println("Unique characters of " + str2 + ": " + uniqueChars2);
    
        List<Character> uniqueChars3 = uc.getUniqueCharacters(str1);
        System.out.println("Unique characters of " + str1 + ": " + uniqueChars3);
        
        String str3 = "programming";
        List<Character> uniqueChars4 = uc.getUniqueCharacters(str3);

        System.out.println("Unique characters of " + str1 + ": " + uniqueChars4);

    }
    
}
