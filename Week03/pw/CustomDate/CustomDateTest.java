import java.util.Scanner;

import pp2.week03.datetime.CustomDate;

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