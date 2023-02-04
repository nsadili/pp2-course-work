import java.util.Scanner;
public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

