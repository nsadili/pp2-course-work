package pp2.week3.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private LocalDate date;

    public Date() {
        this.date = LocalDate.now();
    }

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public int getYear() {
        return date.getYear();
    }

    public void setYear(int year) {
        date = date.withYear(year);
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public void setMonth(int month) {
        date = date.withMonth(month);
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public void setDay(int day) {
        date = date.withDayOfMonth(day);
    }

    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(formatter));
    }

    public static int compare(Date date1, Date date2) {
        return date1.date.compareTo(date2.date);
    }
}
