import java.util.*;

public class cacjing {
    private static Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public static char[] MSTLST(String inputString) {
        Map<Character, Integer> count;
        char[] result = new char[2];

        
        if (cache.containsKey(inputString)) {
            count = cache.get(inputString);
            result[0] = MST(count);
            result[1] = LST(count);
            return result;
        }

        
        count = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        
        result[0] = MST(count);
        result[1] = LST(count);

        
        cache.put(inputString, count);

        return result;
    }

    private static char MST(Map<Character, Integer> charCountMap) {
        char most= '\0';
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > max) {
                max = count;
                most = c;
            }
        }
        return most;
    }

    private static char LST(Map<Character, Integer> charCountMap) {
        char least= '\0';
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count < min) {
                min = count;
                least = c;
            }
        }
        return least;
    }
}

