import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (sc.hasNextDouble()) {

            sum += sc.nextDouble();
            count++;

        }

        if (count != 0) {

            System.out.println(sum / count);

        }

        else {

            System.out.println("Error message");

        }

    }
}
