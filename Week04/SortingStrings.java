package Week04;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the string to sort: ");
        String str = sc.nextLine();
        System.out.println(sort(str));
    }

    public static String sort(String str) {
        String[] ch = str.split("");
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j].toLowerCase().compareTo(ch[i].toLowerCase()) < 0) {
                    swap(ch, i, j);
                }
            }
        }
        return Arrays.toString(ch);
    }

    public static void swap(String[] ch, int i, int j) {
        String temp = ch[j];
        ch[j] = ch[i];
        ch[i] = temp;
    }
}
