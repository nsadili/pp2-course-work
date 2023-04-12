package Week07.ex06;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                scanner.next();
            }
        }

        scanner.close();

        if (count == 0) {
            System.out.println("No valid input provided.");
        } else {
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + ((double) sum / count));
        }
    }
}

