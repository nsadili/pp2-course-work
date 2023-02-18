import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        System.out.println("Enter the substring: ");
        String sub = sc.nextLine();
        if (isSubstring(string, sub)) {
            System.out.println("The substring is in the string");
        } else {
            System.out.println("The substring is not in the string");
        }
    }

    public static boolean isSubstring(String string, String sub) {
        if (string.length() < sub.length()) {
            return false;
        }
        for (int i = 0; i < string.length() - sub.length() + 1; i++) {
            if (string.substring(i, i + sub.length()).equals(sub)) {
                return true;
            }
        }
        return false;
    }
}