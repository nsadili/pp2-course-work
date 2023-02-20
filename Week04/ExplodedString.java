package Week04;
import java.util.Scanner;
public class ExplodedString {

    public static StringBuilder explodeString(String string) {

        char[] split = string.toCharArray();

        StringBuilder sb = new StringBuilder();

        StringBuilder exploded = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            exploded.append(sb);
        }

        return exploded;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println(explodeString(str));
    }

}
