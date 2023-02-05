import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        var sum = 0;
        var count = 0;

        while (scan.hasNextInt()) {

            sum += scan.nextInt();
            count++;
        }

        var avg = (double) sum / count;
        System.out.println(
            (count = 0)
            ? "Please enter at least a value"
            : (double) sum / count);
    }
}
