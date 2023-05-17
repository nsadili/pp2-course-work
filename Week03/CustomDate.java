package Week03;

import java.time.LocalDate;

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
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(month, day, year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(month, day, year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(month, day, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate inputDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        return Math.abs(currentDate.compareTo(inputDate));
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        LocalDate localDate1 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
        LocalDate localDate2 = LocalDate.of(date2.getYear(), date2.getMonth(), date2.getDay());
        return localDate1.compareTo(localDate2);
    }

    public void displayFormatted() {
        LocalDate localDate = LocalDate.of(year, month, day);
        String formattedDate = localDate.getDayOfMonth() + " " + localDate.getMonth().toString().substring(0, 3) + " " + localDate.getYear();
        System.out.println(formattedDate);
    }

    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        return true;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
