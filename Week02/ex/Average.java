import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            cnt++;
        }
        System.out.println(sum / cnt);
    }
}
