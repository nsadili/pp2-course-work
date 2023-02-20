import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str1 = input.nextLine();
        
        String str2 = input.nextLine();
        
        if (areAnagrams(str1, str2) == "true") {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
        public static String areAnagrams(String str1, String str2) {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            
            if (chars1.length != chars2.length) {
                return "false";
            }
            
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    return "false";
                }
            }
            
            return "true";
        } 

}
