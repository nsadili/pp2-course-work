import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the pattern: ");
            int size = sc.nextInt();

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    // print * if i+j is odd, # otherwise
                    if ((i+j) % 2 == 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
