package pw;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        scan.close();

        scan = new Scanner(line);
        int sum = 0, count = 0;
        while (scan.hasNext()) {
            String word = scan.next();
            try {
                int number = Integer.parseInt(word);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                // ignore letters
            }
        }

        scan.close();

        if (count == 0){
            System.out.println("There are no VALID input provided!");
            System.out.println("Sum = 0");
            System.out.println("Count = 0");
            System.out.println("Average = 0.000");
        } else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
}