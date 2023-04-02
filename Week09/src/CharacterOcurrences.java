import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class CharacterOcurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Map<Character, Integer> charCount = new TreeMap<>();
        for(int i=0; i<string.length(); i++){
            char c = string.charAt(i);
            charCount.put(c, i);
        }
        System.out.println(charCount.toString());
    }   
}
