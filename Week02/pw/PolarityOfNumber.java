import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n == 0) System.out.println("neutral");
        if (n > 0) System.out.println("positive");
        if (n < 0) System.out.println("negative");
    }
}
