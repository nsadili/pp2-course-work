import java.util.*;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String explodedString = explodeString(inputString);
        System.out.println(explodedString);
        
    }

    public static String explodeString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result += str.charAt(j);
            }
        }
        return result;
    }
}
