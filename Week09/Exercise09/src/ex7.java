import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex7 {
    static HashMap<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String input1 = scn.nextLine();
        scn.close();

        // a
        System.out.println(mostLeastFrequent(input1));
        // b
        System.out.println(mostLeastFrequent(input1));
    }

    public static String mostLeastFrequent(String string) {
        if (cache.containsKey(string)) {
            return cache.get(string);
        }

        System.out.println("Evaluating the answer...");

        int a[] = new int[26];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < string.length(); j++) {
                if ('a' + i == string.toLowerCase().toCharArray()[j]) {
                    a[i]++;
                }
            }
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int x: a) {
            if (x > max && x != 0) max = x;
            if (x < min && x != 0) min = x;
        }

        List<String> maxChar = new LinkedList<>();
        List<String> minChar = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max && a[i] != 0) 
                maxChar.add(Character.toString((char)('a' + i)));
            if (a[i] == min && a[i] != 0) 
                minChar.add(Character.toString((char)('a' + i)));
        }

        String s = "Maximum: " + maxChar + "; Minimum: " + minChar;
        cache.put(string, s);
        return s;
    }
}
