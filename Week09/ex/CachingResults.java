import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    public static void main(String[] args) {
        String s = String.join(" ", args);
        Map<Character, Integer> map = getF(s);
        System.out.println("It is the input you added: "+s);
        System.out.println("It is the most used character: "+getMost(map));
        System.out.println("It is the least used character: "+getLess(map));





    }
    public static Map<Character, Integer> getF(String a) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
    public static char getMost(Map<Character, Integer> map) {
        char most = '\0';
        int mx = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mx) {
                mx = entry.getValue();
                most = entry.getKey();
            }
        }
        return most;
    }
    public static char getLess(Map<Character, Integer> map) {
        char less = '\0';
        int mn = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < mn) {
                mn = entry.getValue();
                less = entry.getKey();
            }
        }
        return less;
    }
}
