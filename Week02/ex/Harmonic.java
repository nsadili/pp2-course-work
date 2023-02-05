import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        double sum = 1;
        for (int i = 2; i <= num; i++) {
            sum = sum + (1.0 / i);


        }

        System.out.println("Harmonic of " + num + " is " + sum);
    }

}

}