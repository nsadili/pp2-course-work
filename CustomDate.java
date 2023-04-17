package pp2.week03.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(month, day, year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(month, day, year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(month, day, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }

    public int difference(CustomDate date) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate otherDate = LocalDate.of(date.year, date.month, date.day);
        return thisDate.compareTo(otherDate);
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        LocalDate ld1 = LocalDate.of(date1.year, date1.month, date1.day);
        LocalDate ld2 = LocalDate.of(date2.year, date2.month, date2.day);
        return ld1.compareTo(ld2);
    }

    public void displayFormatted() {
        LocalDate localDate = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(localDate.format(formatter));
    }

    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 2 && day > 29) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        if (year < 0) {
            return false;
        }
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public String getName() {
        return null;
    }

}
