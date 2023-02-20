package Week04.Strings;
import java.util.Scanner;
public class Mixedstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the input: ");
        String sentence = sc.nextLine();
        System.out.println((mixedStrings(sentence)));
    }
    public static String[] mixedStrings(String sentence) {
        String[] split = sentence.split(" ");
        String[] newString = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            newString[i] = swapFirstAndLast(split[i]);
        }
        return newString;
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


        }
    }
}
