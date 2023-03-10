package PW6;
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
                    if (!(word.charAt(i) >= 48 && word.charAt(i) <= 57) && !(word.charAt(i) == ' ')) 
                        throw new IllegalArgumentException();
                    sum += Integer.parseInt(word); // read it and parse into Integer
                    count++;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input has to be a number!");
            e.printStackTrace();
        }

        try {
            if (count == 0)
                throw new NoValidInput();
            else
                System.out.printf("Sum = %d\nCount = %d\nAverage = %.2f\n", sum, count, (float)sum / count);
        } catch (NoValidInput e) {
            System.out.println("No valid input provided!");
            e.printStackTrace();
        }
    }
}
