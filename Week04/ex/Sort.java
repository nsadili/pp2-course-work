import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(sortString(input));
    }

    private static String sortString(String str){

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        return new String(chars);
    }


    
}
