import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String sub = sc.nextLine();
        int index = findSubstringIndex(string, sub);
        System.out.println(index);
    }

    public static int findSubstringIndex(String string, String sub) {
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found == true) {
                return i;
            }
        }
        return -1;
    }
}
