import java.util.Scanner;

public class PW13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.println(string);
        slice(string);
    }

    static void slice(String string) {
        for (int i = 1; i < string.length(); i++) {
            System.out.println(string.substring(0, i) + " " + string.substring(i, string.length()));
        }
    }
}
