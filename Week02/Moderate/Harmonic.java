import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;

        if (a <= 0) {
            System.out.println("Input must be positive");

        }

        else {

            for (int i = 1; i <= a; i++) {
                sum += 1.0 / i;
            }

        }

        System.out.println(sum);

    }

}
