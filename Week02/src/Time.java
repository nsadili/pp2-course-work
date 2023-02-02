import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputSeconds = scn.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = (inputSeconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
