import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class CharacterOccurrences {
    public static void main(String[] args) {

      CharacterCount(args[0]);

    }

    static void CharacterCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] strArray = str.toCharArray();

        Iterator it = hm.keySet().iterator();
        while(it.hasNext()) {
            for(int i = 0; i < hm.size(); i++)
            hm.put(str.charAt(strArray[i]), i);
        }

        for(char c : strArray) {
            if (hm.containsKey(c))
            for(int i = 0; i < hm.size(); i++)
            hm.put(str.charAt(strArray[i]), i);
           // hm.put(c, hm.get(c));
            // else 
            //     hm.put(c, 1);
            
        }
        System.out.println(hm);

        // for(Entry<Character, Integer> entry : hm.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
    }
}
