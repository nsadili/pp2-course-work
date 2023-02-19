import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(sorting(s));
    
    }


    public static String sorting(String str) {

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String x = new String(ch);
        return x;

    }

}