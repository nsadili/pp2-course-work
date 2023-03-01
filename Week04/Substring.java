package Week04;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the input: ");
        String string = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(substring(string, sub));
    }

    public static int substring(String string, String sub) {
        char[] split = string.toCharArray();
        char[] splitsub = sub.toCharArray();
        int j = 0;
        for (int i = 0; i < split.length; i++) {
            if (splitsub[j] == split[i]){
                if (j == splitsub.length - 1) return i - j + 1;
                j++;
            }
            else j = 0;
        }
        return -1;
    }
}
