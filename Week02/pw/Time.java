import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sec;
        int h, m, s;

        System.out.print("Enter seconds: ");
        sec = input.nextInt();

        h = sec / 3600;
        m = sec % 3600 / 60;
        s = sec % 60;
        System.out.printf("%d hours %d minutes %d seconds", h, m, s);
    }
}