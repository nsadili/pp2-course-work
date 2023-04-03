import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharOccur {
    public static void main(String[] args) {

        CharOccur(args[0]);   // albali
    }

    static void CharOccur(String str) {
        
        HashMap<Character, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!hm.containsKey(ch)) {
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                hm.put(ch, lst);
            }
            else {
                hm.get(ch).add(i);
            }
        }
        System.out.println(hm);
    }
}
