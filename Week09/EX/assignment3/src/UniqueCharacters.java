import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    private Map<String, List<Character>> cacheMap;

    public UniqueCharacters() {
        cacheMap = new HashMap<>();
    }

    public List<Character> getUniqueChars(String input) {

        if (cacheMap.containsKey(input)) {
            System.out.println("Using cache");
            return cacheMap.get(input);
        }

        List<Character> uniqueChars = new ArrayList<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        cacheMap.put(input, uniqueChars);
        System.out.println("Not using cache");

        return uniqueChars;
    }

    public static void main(String[] args) {
        UniqueCharacters uc = new UniqueCharacters();
        String input = "Hello World";
        List<Character> result1 = uc.getUniqueChars(input);
        System.out.println(result1);

        List<Character> result2 = uc.getUniqueChars(input);
        System.out.println(result2);

        List<Character> result3 = uc.getUniqueChars("Goodbye World");
        System.out.println(result3);

        List<Character> result4 = uc.getUniqueChars(input);
        System.out.println(result4);
    }
}