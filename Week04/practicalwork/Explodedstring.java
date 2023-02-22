package Week04.practicalwork;

import java.util.Scanner;

public class Explodedstring {
    public static void main (String [] args ){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(explodeString(s));
    }

    public static String explodeString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.substring(0, i + 1));
        }
        return output.toString();
}
}
