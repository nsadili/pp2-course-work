import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            char[] sChars = str.toCharArray();
            Arrays.sort(sChars);
            String sortedS = new String(sChars);
            String arr = scan.nextLine();
            char[] arrChars = arr.toCharArray();
            Arrays.sort(arrChars); 
            String sortedArr = new String(arrChars);
            if (sortedS.equals(sortedArr)) {
            
                System.out.println("YES");
            } else {
            
                System.out.println("NO");
            }
        }
    }
}