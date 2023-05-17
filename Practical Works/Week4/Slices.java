import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        System.out.println("Slices:");
        for (int i = 1; i < word.length(); i++) {
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
    }
}
