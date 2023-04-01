package pw;

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
            String str = scan.nextLine();
            if (str.equals("e")) {
                break;
            }
            if (!cache.containsKey(str)) {
                Map<Character, Integer> info = new LinkedHashMap<>();
                for (Character ch : str.toCharArray()) {
                    info.put(ch, info.getOrDefault(ch, 0) + 1);
                }
                cache.put(str, info);
                System.out.println("creating new cache:" + cache.get(str));
            } else {
                System.out.println("retrieving from cache:" + cache.get(str));
            }
            Map<Character, Integer> freqMap = cache.get(str);

            char mostFreqChar = ' ';
            int maxFreq = Integer.MIN_VALUE;
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    mostFreqChar = entry.getKey();
                }

            }
            System.out.println("Most frequent characters:");
            for (Map.Entry<Character, Integer> entry1 : freqMap.entrySet()) {
                if (entry1.getValue() == maxFreq) {
                    System.out.println(entry1.getKey() + "(" + maxFreq + " times)");

                }
            }

            char leastFreqChar = ' ';
            int leastFreq = Integer.MAX_VALUE;
            for (Map.Entry<Character, Integer> entry1 : freqMap.entrySet()) {
                if (entry1.getValue() < leastFreq) {
                    leastFreq = entry1.getValue();
                }
            }
            System.out.println("Least frequent characters:");
            for (Map.Entry<Character, Integer> entry1 : freqMap.entrySet()) {
                if (entry1.getValue() == leastFreq) {
                    System.out.println(entry1.getKey() + "(" + leastFreq + " times)");

                }
            }

        }

    }
}