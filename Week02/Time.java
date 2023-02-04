
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        // a=givenseconds
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int hour = a / 3600;
        int minutes = (a % 3600) / 60;
        int second = a % 60;
        System.out.println(hour + ":" + minutes + ":" + second);
    }
}
