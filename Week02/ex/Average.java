import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        var sum = 0;
        var count = 0;

        while (input.hasNextInt()) {
            num = input.nextInt();

            sum += num;
            count++;
        }

        System.out.println(
                (count == 0)
                        ? (float) sum / count
                        : "Please, enter at least a value");

    }
}
