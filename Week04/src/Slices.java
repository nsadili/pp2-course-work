import java.util.*;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 1; i < word.length(); i++) {
            String slice = word.substring(0, i) + " " + word.substring(i, word.length());
            System.out.println(slice);
        }

    }
}
