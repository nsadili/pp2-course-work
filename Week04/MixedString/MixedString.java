package MixedString;

import java.util.Scanner;

public class MixedString {

    public static String changeWords(String s) {
        char c[] = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        s = String.valueOf(c);
        return s;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String mass[] = s.split(" ");
            for (int i = 0; i < mass.length; i++) {
                mass[i] = changeWords(mass[i]);
            }
            String newsentence = String.join(" ", mass);
            System.out.println(newsentence);
        }

    }
}
