import java.util.Scanner;

public class Substring {
    public static int findSubstring(String string, String sub) {
        int n = string.length();
        int m = sub.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        System.out.print("Enter a substring: ");
        String sub = sc.nextLine();
        sc.close();

        int index = findSubstring(string, sub);
        if (index == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Substring found at index " + index + ".");
        }
    }
}
