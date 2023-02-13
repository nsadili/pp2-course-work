package datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

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
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
    public int difference(CustomDate date) {
        int currentDateInDays = getDateInDays();
        int inputDateInDays = date.getDateInDays();
        return Math.abs(currentDateInDays - inputDateInDays);
    }
    public static int compare(CustomDate date1, CustomDate date2) {
        int date1InDays = date1.getDateInDays();
        int date2InDays = date2.getDateInDays();

        if (date1InDays < date2InDays) {
            return 1;
        } else if (date1InDays > date2InDays) {
            return -1;
        } else {
            return 0;
        }
    }
    private int getDateInDays() {
        return 0;
    }

    public void displayFormatted() {
        System.out.println(day + " " + getMonth() + " " + year);
    }

}
