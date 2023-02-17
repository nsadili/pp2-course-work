package Week04.pw;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string:");
        System.out.println(swapFirstLast(sc.nextLine()));
    }

    public static String swapFirstLast(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char tmp = words[i].charAt(0);
            words[i] = words[i].charAt(words[i].length() - 1) + words[i].substring(1);
            words[i] = words[i].substring(0, words[i].length() - 1) + tmp;
        }
        return String.join(" ", words);
    }
}
