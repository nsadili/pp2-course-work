package pw;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CachingResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<Character, Integer>> cache = new LinkedHashMap<>();
        while (true) {
            System.out.println("Print 'e' to exit\nPlease enter your string:");
            String str = scan.nextLine().toLowerCase();
            if (str.equals("e")) {
                break;
            }
            if (!cache.containsKey(str)) {
                Map<Character, Integer> info = new LinkedHashMap<>();
                for (Character ch : str.toCharArray()) {
                    info.put(ch, info.getOrDefault(ch, 0) + 1);
                }
                cache.put(str, info);
            }

            Map<Character, Integer> freqMap = cache.get(str);

            int maxFreq = Integer.MIN_VALUE;
            int leastFreq = Integer.MAX_VALUE;
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                }
                if (entry.getValue() < leastFreq) {
                    leastFreq = entry.getValue();
                }

            }
            System.out.println("Most frequent elements:");
            printChar(maxFreq, freqMap);
            System.out.println("Least frequent elements:");
            printChar(leastFreq, freqMap);
        }

    }

    static void printChar(Integer minMaxInteger, Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(
                    (entry.getValue().compareTo(minMaxInteger) == 0
                            ? entry.getKey() + "-->" + entry.getValue()+"\n"
                            : "\u001b[1A\r"));

        }

    }

}