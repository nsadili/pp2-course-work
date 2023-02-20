import java.util.Scanner;

package EX;


public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reversedString = reverseString(originalString);
        
        System.out.println(reversedString);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }

}

