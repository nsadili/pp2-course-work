package Week04.Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = sc.nextLine();
        String substring = sc.nextLine();
        System.out.println(substring(string, substring));
    }

    public static int substring(String string, String sub) {
        char[] splitstring = string.toCharArray();
        char[] splitsubstring = sub.toCharArray();
        int j = 0;
        for (int i = 0; i < splitstring.length; i++) {
            if (splitsubstring[j] == splitstring[i]) {
                if (j == splitsubstring.length - 1) return i - j + 1;
                j++;
            } else j = 0;
        }
        return -1;
    }
}
