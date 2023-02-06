import java.util.Scanner;

/**
 * To compile: javac -d ./classes .\PrintingPatterns.java <br />
 * To execute: java -cp .\classes\ PrintingPatterns <br />
 * 
 * @author Nuraddin Sh. Sadili
 */

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter a positive number: ");
        int n = scan.nextInt();
        if (n < 1) {
            System.out.println("Non-positive value is entered!");
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(((i + j) % 2 == 0)//
                        ? "* "//
                        : "# ");
            System.out.println();
        }

        scan.close();
    }
}
