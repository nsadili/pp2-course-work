import java.util.Scanner;

public class explodedstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String res = explode(a);
        System.out.println(res);
    }

    public static String explode(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
}