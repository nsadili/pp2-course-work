package pp2.week03.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    public int difference(CustomDate date) {
        Calendar myDate = Calendar.getInstance();
        myDate.set(this.year, this.month - 1, this.day);
        long myDateInMillis = myDate.getTimeInMillis();

        Calendar input = Calendar.getInstance();
        input.set(date.year, date.month - 1, date.day);
        long inputTimeInMillis = input.getTimeInMillis();

        long differenceInMillis = Math.abs(myDateInMillis - inputTimeInMillis);

        return (int) (differenceInMillis / (1000 * 60 * 60 * 24));
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(date1.year, date1.month - 1, date1.day);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(date2.year, date2.month - 1, date2.day);
        return cal1.compareTo(cal2);
    }

    public String displayFormatted() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.US);
        return sdf.format(cal.getTime());
    }
}
