package Week09.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CatchingResults {
    public static void main(String[] args) {

        theFrequentChars(args[0]);
    }
    
    static void theFrequentChars(String str) {
        int max = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        HashMap<Character, List<Character>> hmMost = new HashMap<>();
        HashMap<Character, List<Character>> hmLeast = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (!hmMost.containsKey(ch)) {

                List lst1 = new ArrayList<>();
                lst1.add(ch);
                hmMost.put(ch, lst1);

            }

            if (!hmLeast.containsKey(ch)) {

                List lst2 = new ArrayList<>();
                lst2.add(ch);
                hmMost.put(ch, lst2);
                
            } 
        }
            System.out.println(hmLeast);
            System.out.println(hmMost);
    }
}
