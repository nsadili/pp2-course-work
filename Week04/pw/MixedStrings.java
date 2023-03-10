package Week04.pw;

import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter an input: ");
            String sentence = input.nextLine();
            print(mixedStrings(sentence));
        }
    }

    public static String[] mixedStrings(String sentence) {
        String[] split = sentence.split(" ");
        String[] newSentence = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            newSentence[i] = swapFirstAndLast(split[i]);;
        }
        return newSentence;
    }

    public static String swapFirstAndLast(String str) {
        if (str.length() < 2)
            return str;
        char[] ch = str.toCharArray();
        swap(ch, 0, ch.length - 1);
        return String.valueOf(ch);
    }

    public static void swap(char[] ch, int i, int j) {
        char temp = ch[j];
        ch[j] = ch[i];
        ch[i] = temp;
    }

    public static void print(String[] str) {
        for (String n: str) {
            System.out.print(n + " ");
        }
    }
}