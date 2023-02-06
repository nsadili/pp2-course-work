import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        double harmonic = 0;
        for (int i = 1; i <= num; i++) {
            harmonic = harmonic + (double) 1 / i;
        }
        System.out.println("Harmonic " + num + " is: " + harmonic);
    }
}

