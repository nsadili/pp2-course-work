import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double min = 1342458244;
        double max = -1342458244;
        while (scan.hasNextDouble()) {
          
             double input = scan.nextDouble();
            if (input < min)
                min = input;
            if (input > max)
                max = input;
        }
        System.out.println("Minimum" + min);
        System.out.println("Maximum" + max);
    }
}