package Week07.pw6;
import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // reading from standard input

        String line = scan.nextLine(), word = null;
        scan.close();
        scan = new Scanner(line); // reading from a String

        int sum = 0, count = 0;
        try {
            while (scan.hasNext()) { // while there is a token to be read from the string
                word = scan.next();
                for (int i = 0; i < word.length(); i++) {
                    if (!(word.charAt(i) >= '0' && word.charAt(i) <= '9') && !(word.charAt(i) == ' ')) {
                        scan.close();
                        throw new IllegalArgumentException();
                    }
                    sum += Integer.parseInt(word); // read it and parse into Integer
                    count++;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input has to be a number!");
        }

        try {
            if (count == 0)
                throw new IllegalArgumentException();
            else
                System.out.printf("Sum = %d\nCount = %d\nAverage = %.2f\n", sum, count, (float) sum / count);
        } catch (IllegalArgumentException e) {
            System.out.println("There are no VALID input provided!");
        }
    }
}
