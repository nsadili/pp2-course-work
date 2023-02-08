package Week2;
import java.util.Scanner;
public class Calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of a and b: "+(a+b));
        System.out.println("Subtraction of b from a: "+(a-b));
        System.out.println("Multiplication of and b: "+(a*b));
        System.out.println("Integer division of a to b: "+(a/b));
        System.out.println("Remainder of the devision of a to b: "+(a%b));
        sc.close();
    }
}
