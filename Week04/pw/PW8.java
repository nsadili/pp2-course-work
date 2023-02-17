import java.util.Scanner;

public class PW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.println("Exploded string: " + explodedString(string));

    }

    static String explodedString(String string) {
        char[] array = new char[string.length()];
        array = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i+1; j++) {
                stringBuilder.append(array[j]);
            }
        }
        return stringBuilder.toString();
    }
}
