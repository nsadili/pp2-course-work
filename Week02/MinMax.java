import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        double n, min=0, max=0;
        if (scanner.hasNextDouble()) {
            n = scanner.nextDouble();
            min = n;
            max = n;
            while (scanner.hasNextDouble()) {
                n = scanner.nextDouble();
                if (n < min) min = n;
                if (n > max) max = n;
            }
            System.out.println("Min: " + min + "; Max: " + max);
        }
    }
}
