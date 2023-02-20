import java.util.Scanner;

public class MixedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String mixedString = swapMixedStr(str);
        System.out.println(mixedString);

    }

    public static String swapMixedStr(String str) {

        String[] word = str.split(" ");
        for (int i = 0; i < word.length; i++)
            word[i] = reverse(word[i]);
        return String.join(" ", word);
    }

    public static String reverse(String word) {
        char[] ch = word.toCharArray();
        int length = ch.length;
        char temp = ch[0];
        ch[0] = ch[length - 1];
        ch[length - 1] = temp;
        return new String(ch);
    }
}
