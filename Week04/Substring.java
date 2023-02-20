import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = sc.nextLine();
        System.out.println("Please enter a substring to find:");
        String sub = sc.nextLine();
        System.out.println(isSubstring(str, sub));
    }

    public static int isSubstring(String str, String sub) {
        for (int i = 0; i < str.length(); i++) {
            if (sub.length() > str.length() - i) return -1;
            if (str.substring(i).startsWith(sub)) return i;
        }
        return -1;
    }
}