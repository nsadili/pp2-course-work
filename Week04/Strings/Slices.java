package Week04.Strings;
import java.util.Scanner;
public class Slices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the input: ");
        String str = scanner.nextLine();
        slicing(str);
    }
    public static void slicing(String word) {
        String[] split = word.split("");
        for (int i = 1; i < split.length; i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i, split.length));
        }
    }
}
