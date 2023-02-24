package Week04;

import java.util.Scanner;
public class ExplodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the string: ");
        String str = sc.nextLine();
        String[] split = str.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (String s : split) {
            sb.append(s);
            result.append(sb);
        }
        System.out.println("The result: "+ result);
        sc.close();
    }
}