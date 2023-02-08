import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) System.out.println("Error: please specify a positive integer.");
        else System.out.println(1.0 / n);
    }
}
