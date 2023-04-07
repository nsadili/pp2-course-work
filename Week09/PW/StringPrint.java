import java.util.*;
public class StringPrint {
    public static void main(String[] args) {


        String str = args[0];
        


        System.out.println("Characters and their indexes in non-descending order:");
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.println(c + " : " + str.indexOf(c));
        }
        


        System.out.println("\nCharacters and their indexes in non-ascending order:");
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            System.out.println(c + " : " + str.indexOf(c));
        }
    }
}
