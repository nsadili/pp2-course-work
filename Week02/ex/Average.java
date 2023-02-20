import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        var sum = 0;
        var cnt = 0;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            sum += sc.nextInt();
            cnt++;
        }

        

        System.out.println(
            (cnt == 0) ? "Please enter a value" : (double) sum / cnt
        );
    }
}
