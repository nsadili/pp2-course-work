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
        char[] break = string.toCharArray();
        char[] breaksub = sub.toCharArray();
        int a = 0;
        for (int i = 0; i < break.length; i++) {
            if (breaksub[j] == break[i]){
                if (a == breaksub.length - 1) return i - a + 1;
                j++;
            }
            else a = 0;
        }
        return -1;
    }
}