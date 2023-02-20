import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        sc.close();

        for (int i = 1; i < word.length(); i++) {
            String firstPart = word.substring(0, i);
            String secondPart = word.substring(i);

            System.out.println(firstPart + " " + secondPart);
        }

        System.out.println(word); // original word
    }
}
