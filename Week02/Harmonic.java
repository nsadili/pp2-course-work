import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");

        int n = scan.nextInt();
        scan.close();

        double sum = 1;

        for(int i = 2; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("The harmonic series upto " + n + " terms is " + sum);

    }
}
