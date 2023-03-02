import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            for (int i = 0; i < word.length(); i++) {
                String slice = word.substring(0, i) + " " + word.substring(i);
                System.out.println(slice);
            }
        }
    }
}
