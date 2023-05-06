package Week02;


import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
