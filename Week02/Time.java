import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        
        int seconds = scanner.nextInt();
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + remainingSeconds + " seconds");
    }
}
