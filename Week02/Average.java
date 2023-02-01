import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var count = 0;
        var sum = 0;

        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            count++;
        }

        // var avg = (float) sum / count;
        // System.out.println(avg);
        System.out.println(
                (count > 0)
                        ? (float) sum / count
                        : "Please, provide at least a number"
        );
    }
}
