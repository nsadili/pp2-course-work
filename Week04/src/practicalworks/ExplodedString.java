// not ready still...


package practicalworks;

import java.util.Scanner;

public class ExplodedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a delimiter character: ");
        char delimiter = scanner.next().charAt(0);
        String exploded = explodeString(str, delimiter);
        System.out.println("Exploded string: " + exploded);
    }

    public static String explodeString(String input, char delimiter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (i > 0 && c != delimiter && input.charAt(i - 1) != delimiter) {
                sb.append(delimiter);
            }

            sb.append(c);
        }

        return sb.toString();
    }


}


