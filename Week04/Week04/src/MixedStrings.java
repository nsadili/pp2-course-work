import java.util.Arrays;
import java.util.Scanner;
public class MixedStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String substrings[] = s1.split(" ");
        for(int i = 0; i < substrings.length; i++){
            substrings[i] = ChangeFirstAndLast(substrings[i]);
        }

        for(int i = 0; i < substrings.length; i++){
            System.out.print(substrings[i] + " ");
        }
    }
    public static String ChangeFirstAndLast(String m){
        if (m.length() > 1) {
            char first = m.charAt(0);
            char last = m.charAt(m.length() - 1);
            String newString = last + m.substring(1, m.length() - 1) + first;
            return newString;
        } else {
           return m;
        }
    }
}
