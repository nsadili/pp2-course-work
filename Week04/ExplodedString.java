package Week04;

import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] split = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            result.append(sb);
        }
        System.out.println(result);
    }
}
