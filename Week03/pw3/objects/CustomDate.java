package pw3.objects;
import java.util.Calendar;

public class CustomDate {
    private int month;
    private int day;
    private int year; 

    public CustomDate(int month, int day, int year){
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public void displayDate(){
        System.out.printf("%d/%d/%d", month, day, year);
    }

    public int difference(CustomDate Date){
        Calendar date1 = Calendar.getInstance();
        date1.set(this.year, this.month - 1, this.day);
        Calendar date2 = Calendar.getInstance();
        date2.set(Date.getYear(), Date.getMonth() - 1, Date.getDay());
        long diffInMillies = date2.getTimeInMillis() - date1.getTimeInMillis();
        if (diffInMillies < 0) {
            return (int)(diffInMillies / (24 * 60 * 60 * 1000)) * -1;
        }
        return (int)(diffInMillies / (24 * 60 * 60 * 1000));
    }

    public static int compare(CustomDate date1, CustomDate date2){
        Calendar cal1 = Calendar.getInstance();
        cal1.set(date1.getYear(), date1.getMonth() - 1, date1.getDay());
        Calendar cal2 = Calendar.getInstance();
        cal2.set(date2.getYear(), date2.getMonth() - 1, date2.getDay());
        if (cal1.getTimeInMillis() < cal2.getTimeInMillis()) {
            return 1;
        }
        if (cal1.getTimeInMillis() > cal2.getTimeInMillis()) {
            return -1;
        }
        return 0;
    }

    public void displayFormatted() {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String monthName = monthNames[month - 1];
        System.out.printf("%d/%s/%d", day, monthName, year);
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
