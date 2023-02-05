import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double n = 1.0;

        double sum = 0.0;
        x = x % (2 * Math.PI);

        int i;

        for (i = 1; n != 0.0; i++) {
            n *= (x / i);
            if (i % 4 == 3) {
                sum -= n;
            }
            if (i % 4 == 1) {
                sum  += n;
            }
        }
        double y = Math.sin(x);

        System.out.println(" Sum :" +sum );

    }

}