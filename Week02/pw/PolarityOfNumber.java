import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number!");
        var A = sc.nextFloat();

        if (A>0) System.out.println("Positive!");
        if (A==0) System.out.println("Neutral!");
        if (A<0) System.out.println("Negative!");
    }
}