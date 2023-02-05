import java.util.Scanner;

public class Avarege {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        var sum = 0;
        var count = 0;

        input.hasNextInt();

        while (input.hasNextInt()) {

            sum += input.nextInt();
            count++;

        }

        System.out.println(
                (count == 0)
                        ? "please, enter at least a value"
                        : (double) sum / count);

    }
}
