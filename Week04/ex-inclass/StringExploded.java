import java.util.Scanner;

public class StringExploded {
    public static void main(String[] args) {
        System.out.println(explode(args[0]));
    }


    private static String explode(String str) {
        StringBuilder res = new StringBuilder("");
        int k = 0;
        for(int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                char nextCharacter = str.charAt(j);
                res.append(nextCharacter);
            }
        }
        return res.toString();
    }

}
