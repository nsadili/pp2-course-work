import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        input.close();
        for (int i = 1; i < word.length(); i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
        System.out.println(word);
    }
}