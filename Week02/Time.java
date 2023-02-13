import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int seconds = scn.nextInt();
        int hour = seconds / 3600;
        int minutes = (seconds - (hour * 3600)) / 60;
        int second = seconds - (hour * 3600 + minutes *60);

        System.out.println(hour + ":" + minutes + ":" + second);

    }
}