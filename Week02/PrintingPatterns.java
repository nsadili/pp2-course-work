import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
