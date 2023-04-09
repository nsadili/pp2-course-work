package Pw;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line);
        int sum = 0, count = 0;
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                word = scan.next();
                sum += Integer.parseInt(word);
                count++;
            } else {
                scan.next();
            }

        }

        scan.close();

        if (count == 0)
            System.out.println("There isn't any valid input provided!");
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
}
