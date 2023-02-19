import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String str = sc.nextLine();
        
        char[] sChars = str.toCharArray();
        
        Arrays.sort(sChars);
        
        String sortedS = new String(sChars);


        String arr = sc.nextLine();
        
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