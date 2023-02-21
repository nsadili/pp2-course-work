import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the word: ");
        String word = scanner.nextLine();
        int len = word.length();

        for (int i = 0; i < len-1; i++) {
            String part1 = word.substring(0, i);
            String part2 = word.substring(i);

            System.out.println(part1 + " " + part2);
        }

        System.out.println(word); // original word
    }
}