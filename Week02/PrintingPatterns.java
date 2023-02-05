import java.util.Scanner;

public class PrintingPatterns {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int k = 0; k < n; k++) {
                    if (k % 2 == 0) System.out.print("*");
                    else System.out.print("#");
                }
            } else {
                for (int k = 0; k < n; k++) {
                    if (k % 2 == 0) System.out.print("#");
                    else System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
