import java.util.Scanner;

public class Exercise_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string Baku: ");
        String input = scanner.nextLine();
        System.out.println(explodeString(input));
        scanner.close();
    }

    public static String explodeString(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            builder.append(input.charAt(i)).append(input.charAt(i));
        }
        return builder.toString();
    }
}





