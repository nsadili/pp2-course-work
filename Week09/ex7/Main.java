package Week09.ex7;

import java.util.Map;
import java.util.HashMap;

public class Main {
    private static Map<String, Character> mostFrequentCache = new HashMap<>();
    private static Map<String, Character> leastFrequentCache = new HashMap<>();
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No input string specified.");
            return;
        }
        System.out.println("Most frequent: '" + getMostFrequent(args[0]) + "'");
        System.out.println("Least frequent: '" + getLeastFrequent(args[0]) + "'");
    }

    public static Character getMostFrequent(String s) {
        if (mostFrequentCache.containsKey(s)) return mostFrequentCache.get(s);
        int max = Integer.MIN_VALUE; char res = '\0';
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!m.containsKey(c)) m.put(c, 1);
            else m.put(c, m.get(c) + 1);
            if (m.get(c) > max) {
                max = m.get(c);
                res = c;
            }
        }
        mostFrequentCache.put(s, res);
        return res;
    }

    public static Character getLeastFrequent(String s) {
        if (leastFrequentCache.containsKey(s)) return leastFrequentCache.get(s);
        int min = Integer.MAX_VALUE; char res = '\0';
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!m.containsKey(c)) m.put(c, 1);
            else m.put(c, m.get(c) + 1);
            if (m.get(c) < min) {
                min = m.get(c);
                res = c;
            }
        }
        leastFrequentCache.put(s, res);
        return res;
    }
}
