package pp2.week03.datetime;

import java.time.LocalDate;
import java.time.Month;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid date parameters");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid month parameter");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid day parameter");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid year parameter");
        }
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }

    public int difference(CustomDate date) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        return Math.abs((int) (date1.toEpochDay() - date2.toEpochDay()));
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        LocalDate ld1 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
        LocalDate ld2 = LocalDate.of(date2.getYear(), date2.getMonth(), date2.getDay());

        int returnedValue = 0;

        if (ld1.compareTo(ld2) > 0)
            returnedValue = 1;
        else if (ld1.compareTo(ld2) < 0)
            returnedValue = -1;

        return returnedValue;
    }

    public void displayFormatted() {
        Month m = Month.of(month);
        System.out.printf("%d %s %d%n", day, m.toString().substring(0, 3), year);
    }

    private boolean isValidDate(int month, int day, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}