package Week11;

import java.util.Scanner;
public class HW1_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseStr rv = (String s) -> new StringBuilder(s).reverse().toString();

        String reversedStr = rv.reverse(str);
        System.out.println(reversedStr);

        
    }
}

@FunctionalInterface
interface ReverseStr {
    String reverse(String str);
}


