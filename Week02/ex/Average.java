import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var sum = 0;
        var count = 0;

        while (sc.hasNextInt()) {

            sum += sc.nextInt();

        }

        System.out.println(
                (count == 0)
                        ? "Please enter at least a value"
                        : (double) sum / count);
    }
}
