import java.util.Scanner;

public class StringExploded {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println();
    }


    private static String explode(String str) {
        String res = "";
        int k = 0;
        for(int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                System.out.println(str[i]);
                if (i == k++) {
                    i = 0;
                }
            }
        }
    }

}
