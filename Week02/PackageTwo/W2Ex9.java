package PackageTwo;

import java.util.Scanner;

public class W2Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: no input entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("The average of the input numbers is " + average);
        }
        sc.close();
    }
}
