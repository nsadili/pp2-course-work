import java.util.Scanner;

public class slices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

    }

    private static void slice(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(0, i) + " ");
            System.out.print(s.substring(i));
            System.out.println();
        }
    }
}