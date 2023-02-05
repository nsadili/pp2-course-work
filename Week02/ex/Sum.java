package ex;
import java.util.Scanner;
public class Sum {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add first number: ");
        int n1 = scan.nextInt();
        System.out.println("Please add second number: ");
        int n2 = scan.nextInt();
        int plural = n1+n2;
        System.out.println("The sum of included numbers: " + plural);
    }
}