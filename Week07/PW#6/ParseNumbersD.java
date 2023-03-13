To handle cases where there is no valid input provided, we can check if the count is 0 after the while loop and print a message indicating that there is no valid input.

Updated code:

import java.util.Scanner;

public class ParseNumbersD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// reading from standard input

        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line); // reading from a String
        int sum = 0, count = 0;
        while (scan.hasNext()) { // while there is a token to be read from the string
            word = scan.next();
            try {
                sum += Integer.parseInt(word); // read it and parse into Integer
                count++;
            } catch (NumberFormatException e) {
                // Ignore non-numeric input
            }
        }

        scan.close();

        if (count == 0)
            System.out.println("There are no VALID input provided!");
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
}
