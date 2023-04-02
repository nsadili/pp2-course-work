import java.util.HashMap;

public class CharOccur {
    public static void main(String[] args) {

        CharOccur(args[0]);
    }

    static void CharOccur(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] strArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(strArray[i]))) 
            hm.put(str.charAt(strArray[i]), i);
            System.out.println(str.charAt(strArray[i])+ ": " + i);
        }

        System.out.println(hm);
    }
}
