package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class CachingResults {

    static final Map<String, Pair> cache = new HashMap<>();

    public static void main(String[] args) {

        Pair res;

        res = getMostAndLeastChar("Concrete");
        System.out.println(res);
        res = getMostAndLeastChar("test");
        System.out.println(res);
        res = getMostAndLeastChar("OOO");
        System.out.println(res);
        res = getMostAndLeastChar("Concrete");
        System.out.println(res);

    }

    static Pair getMostAndLeastChar(String string) {
        System.out.println("Input: " + string);

        System.out.println("Calculating...");
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : string.toCharArray())
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);

        int least = string.length() + 1, most = -1, count;
        Character leastCh = null, mostCh = null;
        for (Character ch : counts.keySet()) {
            count = counts.get(ch);
            if (count > most) {
                most = count;
                mostCh = ch;
            }
            if (count < least) {
                least = count;
                leastCh = ch;
            }
        }

        Pair res = new Pair(leastCh, mostCh);
        cache.put(string, res);

        return res;
    }

}

class Pair {
    private Character first;
    private Character second;

    public Pair(Character first, Character second) {
        this.first = first;
        this.second = second;
    }

    public Character getFirst() {
        return first;
    }

    public Character getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return new StringJoiner(" <-> ", "Pair( ", " )").add("" + first).add("" + second).toString();
    }
}