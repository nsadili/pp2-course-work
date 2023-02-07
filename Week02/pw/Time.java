import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        System.out.printf("%02d:%02d:%02d\n", input / 3600, input % 3600 / 60, input % 60);
    }
}
