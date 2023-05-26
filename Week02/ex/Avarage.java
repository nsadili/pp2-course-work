import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            var sum = 0;
            var count = 0;

            while (scan.hasNextInt()) {

                sum += scan.nextInt();
                count++;
            }

            // var avg =(double) sum/count;
            // first change to double next /

            System.out.println(
                    (count == 0)
                            ? "Please enter a value: "
                            : (double) sum / count);
        }

    }
}