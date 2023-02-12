//package Week03.datetime;

public class CustomDate {
    
    private int month, day, year;
    private String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
                                , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    //private int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CustomDate() {

    }

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
        // if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        //     days[1] = 29;
        // } else days[1] = 28;
    }

    public void displayDate() {
        //System.out.println(this.month + "/" + this.day + "/" + this.year);
        System.out.printf("%02d/%02d/%d\n", month, day, year);
    }

    public int difference(CustomDate date) {
        int conversion = (date.year - year) * 365 + (date.month - month) * 31 + (date.day - day);
        return Math.abs(conversion);
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.getYear() != date2.getYear()) {
            if (date1.getYear() - date2.getYear() > 0) return 1;
            if (date1.getYear() - date2.getYear() < 0) return -1;
        }
        if (date1.getMonth() != date2.getMonth()) {
            if (date1.getMonth() - date2.getMonth() > 0) return 1;
            if (date1.getMonth() - date2.getMonth() < 0) return -1;
        }
        if (date1.getDay() != date2.getDay()) {
            if (date1.getDay() - date2.getDay() > 0) return 1;
            if (date1.getDay() - date2.getDay() < 0) return -1;
        }
        return 0;
    }

    public void displayFormatted() {
        System.out.println(this.day + " " + months[this.month-1] + " " + this.year);
    }
}
