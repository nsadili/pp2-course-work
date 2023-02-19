package Week04.pw;

import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();
            String[] split = str.split("");
            StringBuilder sb = new StringBuilder();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                sb.append(split[i]);
                result.append(sb);
            }
            System.out.println(result);
        }
    }
}