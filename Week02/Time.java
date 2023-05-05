package Week02;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of seconds: ");
            int seconds = sc.nextInt();

            int hours = seconds / 3600;
            seconds %= 3600;

            int minutes = seconds / 60;
            seconds %= 60;

            System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
        }
    }

    }

