import java.util.Scanner;

public class Time{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of seconds:");
        int seconds = sc.nextInt();
        int hours = (seconds/3600);
        int minutes = (seconds / 60);
        int remainingSeconds = (seconds % 60);

        System.out.println(hours + " hours ," + minutes + " minutes ," + remainingSeconds + " remainingSeconds");

    }
}