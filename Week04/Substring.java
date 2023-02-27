package Week04;

import java.util.Scanner;

public class Substring {

    public static int substring(String string, String sub) {
        int j = 0;
        char[] split = string.toCharArray();
        char[] splitsub = sub.toCharArray();        

        for (int i = 0; i < split.length; i++) {
            if (splitsub[j] == split[i]){
                if (j == splitsub.length - 1) return i - j + 1;
                j++;
            }
            else j = 0;
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");

        String string = scanner.nextLine();
        String sub = scanner.nextLine();

        System.out.println(substring(string, sub));
        scanner.close();
    }
}