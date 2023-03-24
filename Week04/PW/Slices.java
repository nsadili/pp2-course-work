import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int len = word.length();
        for (int i = 1; i < len; i++) {
            String slice = word.substring(0, i) + " " + word.substring(i, len);
            System.out.println(slice);
        }
        sc.close();
    }
}
