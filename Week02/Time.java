package Week02;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int Seconds = sc.nextInt();

        int hours = Seconds / 3600;
        int minutes = (Seconds % 3600) / 60;
        int seconds = Seconds % 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}

