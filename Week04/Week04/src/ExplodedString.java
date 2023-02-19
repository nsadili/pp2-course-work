import java.util.Scanner;
public class ExplodedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Here is exploded string: " + exploded(s));
    }

    public static String exploded(String m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m.length(); i++) {
            for (int j = 0; j < i; j++) {
                sb.append(m.charAt(j));
            }
        }
        return sb.toString();
    }
}
