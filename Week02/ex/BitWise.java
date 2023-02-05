import java.util.Scanner;

public class BitWise {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 18; // 10010 in binary
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(a>>2); // 10 = 2
        System.out.println(a>>3); // 1 = 1
        System.out.println(a>>>3); // 10010 --> 00010

    }
}
