import java.util.Scanner;

public class Substring {

    static int exists(String string, String sub) {

        if (string.isEmpty() || sub.isEmpty())
            return -1;

        boolean isSubstring;
        int n = string.length();
        int m = sub.length();
        

        for (int i = 0; i < n - m; i++) {
            isSubstring = true; 
            for (int j = 0; j < n; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    isSubstring = false;
                    break;
                }
            }
            if (j == m) {
                return true;
            }
                
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String sub = scan.nextLine();

        System.out.println(exists(sentence, sub));

        scan.close();
    }
}