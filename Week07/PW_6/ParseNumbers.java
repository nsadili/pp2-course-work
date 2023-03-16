package Week07.PW_6;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // reading from standard input

        String line = scan.nextLine();
        scan.close();
        scan = new Scanner(line); // reading from a String

        int sum = 0, count = 0;
        boolean validInput = false;
        while (scan.hasNext()) { // while there is a token to be read from the string
            String word = scan.next();
            try {
                int number = Integer.parseInt(word); // read it and parse into Integer
                sum += number;
                count++;
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Input has to be a number!");
                validInput = false;
                break;
            }
        }
        scan.close();

        if (validInput) {
            if (count == 0) {
                System.out.println("There are no valid inputs provided!");
            } else {
                System.out.printf("Sum = %d\nCount = %d\nAverage = %.2f\n", sum, count, (float) sum / count);
            }
        }
    }
}
