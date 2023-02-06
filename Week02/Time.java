//Write a program that given a number that represents seconds, converts it to hours, minutes, and seconds. (Use Scanner or command-line arguments)

// Path: Time.java

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSeconds);
    }
}

