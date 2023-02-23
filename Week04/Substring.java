package Week04;
import java.util.Scanner;

public class Substring {

public static int Substring(String string, String sub) {
        
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }

        return -1;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string = "hello world";
    String sub = "wor";
    int index = Substring(string, sub);
    System.out.println(index); 
}

}