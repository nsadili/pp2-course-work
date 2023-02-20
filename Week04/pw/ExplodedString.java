package Week04.pw;

import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a string to explode:");
        System.out.println(explodeString(scn.nextLine()));
    }

    public static String explodeString(String str) {
        StringBuilder stb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) stb.append(str.substring(0, i));
        return stb.toString();
    }
}