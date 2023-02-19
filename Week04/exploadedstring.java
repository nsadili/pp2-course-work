import java.util.Scanner;

public class exploadedstring {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to explode: ");
        String str = scanner.nextLine();
        String exploded = explodeString(str);
        System.out.println("Exploded string: " + exploded);
    }

    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
    }

