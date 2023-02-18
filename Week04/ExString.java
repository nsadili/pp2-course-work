import java.util.Scanner;

public class ExString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String exploded = explodedString(input);
        System.out.println(exploded);
    }

    public static String explodedString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(input.charAt(j));
            }
        }
        return sb.toString();
    }
}










