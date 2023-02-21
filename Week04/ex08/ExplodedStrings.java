package Week04.ex08;

import java.util.Scanner;

public class ExplodedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("The exploded form of the string " + string + " is: " + explodeString(string));
        sc.close();
    }

    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i + 1));
        }
        return sb.toString();
    }
}
