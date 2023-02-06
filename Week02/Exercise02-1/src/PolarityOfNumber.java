import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        if (a > 0) System.out.print("Positive");
        else if (a == 0) System.out.print("Neutral");
        else System.out.print("Negative");
    }
}
