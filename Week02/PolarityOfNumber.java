import java.util.Scanner;

class PolarityOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a < 0) {

            System.out.println("Negative");

        } else if (a > 0) {

            System.out.println("Positive");
        } else if (a == 0) {

            System.out.println("Neutral");
        }
    }
}
