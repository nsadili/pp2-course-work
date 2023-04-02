import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class CharacterOccurrences {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i < args.length; i++) {
            System.out.println(i + " = " + args[i]);
        }

        Map<Character, Integer> chars = new TreeMap<>();

       // chars.put(args[i], i);
    }
}
