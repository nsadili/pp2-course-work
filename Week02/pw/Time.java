import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");
    }
}
