import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    int totalSeconds = sc.nextInt();

    int hours = totalSeconds / 3600;
    int minutes = totalSeconds / 60;
    int seconds = totalSeconds;

    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
