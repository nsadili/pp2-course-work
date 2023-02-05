import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for(int i = 1; i <=n; i++)
        {
            sum += 1.0/i;
        }
      System.out.println("Sum of harmonic series till " + n + "th number is "+ sum);
      scanner.close();
    }
}
