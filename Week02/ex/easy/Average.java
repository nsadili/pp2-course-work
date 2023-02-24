
//package taghi_mammadov.week_02;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sum = 0;
            int count = 0;

            while (sc.hasNextDouble()) {
                sum += sc.nextDouble();
            }
            System.out.println(
                    (count == 0)
                            ? "No value is entered"
                            : (double) sum / count);
        }
    }
}
