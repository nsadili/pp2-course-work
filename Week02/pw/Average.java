import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var sum = 0;
        var cnt = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println(
                cnt == 0
                        ? "Please,enter the number"
                        :

                        "Average is: " + (double) sum / cnt

        );

    }
}