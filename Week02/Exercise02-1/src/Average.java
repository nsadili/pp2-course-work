import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, cnt = 0;
        double s = 0;
        while (scan.hasNextInt()) {
            n = scan.nextInt();
            s += n; cnt++;
        }
        if (cnt == 0) System.out.print("No integer entered.");
        else System.out.print(s / cnt);
    }
}
