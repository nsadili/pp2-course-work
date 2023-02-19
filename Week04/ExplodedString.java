package Week04;

import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the string: ");
        String str = sc.nextLine();
        System.out.println(explodeString(str));
    }

    public static StringBuilder explodeString(String string) {
        char[] split = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder exploded = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            exploded.append(sb);
        }
        return exploded;
    }
}
