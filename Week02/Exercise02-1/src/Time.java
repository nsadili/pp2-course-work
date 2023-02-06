import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int h = n / 3600;
            int m = (n - h * 3600) / 60;
            int s = n - h * 3600 - m * 60;
            System.out.printf("%d:", h);
            System.out.printf("%02d:", m);
            System.out.printf("%02d", s);
    }
}