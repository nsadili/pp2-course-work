import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        int max = scan.nextInt();
        long n = (long)(Math.random() * max + 1);
        System.out.printf("please enter the value: ");
        long gues = scan.nextLong();
        while (gues != n) {
            if (!scan.hasNextLong()) {
                System.out.println("Program Terminated");
                break;
            }
            if (gues < n) {
                System.out.println("HIGHER");
                System.out.printf("please enter the value: ");
                gues = scan.nextLong();
            }
            if (gues > n) {
                System.out.println("LOWER");
                System.out.printf("please enter the value: ");
                gues = scan.nextLong();
            }
        }
        if (gues == n) {
            System.out.println("WINNER");
        }
    }
}
