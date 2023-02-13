package week03.src.datetime;

import java.util.Scanner;

public class CustomDateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        CustomDate date = new CustomDate(day, month, year);
        date.displayDate();

    }
}
