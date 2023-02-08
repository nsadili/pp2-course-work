import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0, min = 0, tmp;
        if (sc.hasNextDouble()) {
            max = sc.nextDouble();
            min = max;
        }
        while (sc.hasNextDouble()) {
            tmp = sc.nextDouble();
            max = Double.max(max, tmp);
            min = Double.min(min, tmp);
        }
        System.out.printf("Max: %f\nMin: %f\n", max, min);
    }
}
