package Week04;

import java.util.Scanner;

public class MixedStrings {

    public static String[] mixedStrings(String sentence) {

        String[] split = sentence.split(" ");
        String[] newSentence = new String[split.length];

        for (int i = 0; i < split.length; i++) {
            newSentence[i] = swapFirstAndLast(split[i]);
        }

        return newSentence;
    }

    public static String swapFirstAndLast(String str) {

        if (str.length() < 2){
            return str;
        }
        
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
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");

        String sentence = scanner.nextLine();

        print(mixedStrings(sentence));
        scanner.close();

    }
}