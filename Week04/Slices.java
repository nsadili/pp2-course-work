import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("The slices are: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i, word.length()));
        }
    }
}
