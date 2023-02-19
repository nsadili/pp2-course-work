import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


    }

    private static String explodeString(String n) {

        StringBuilder x = new StringBuilder();

        for(int a = 0; a < n.length(); a++) {
            for(int b = 0; b < a; b++) {

                char c = n.charAt(b);
                x.append(c);
            }
        }
        return x.toString();

    }

}