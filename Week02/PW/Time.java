package PW;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Seconds = input.nextInt();

        int hour = Seconds / 3600;
        int minute = Seconds % 3600 / 60;
        int second = Seconds % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}