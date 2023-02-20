import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        System.out.print("Enter a substring: ");
        String sub = sc.nextLine();
        findSubstring(string, sub);
    }

    public static void findSubstring(String string, String sub) {
        int index = -1;
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            if (string.substring(i, i + sub.length()).equals(sub)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
