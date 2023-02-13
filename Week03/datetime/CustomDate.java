package pp2.week03.datetime;

import com.sun.jdi.IntegerValue;

public class CustomDate {
    private int month;
    private int day;
    private int year;


    public CustomDate(int year, int month, int day) {
        this.year = year;
        if (month < 1 || month > 12) {
            this.month = Integer.valueOf("Invalid Date");
        } else {
            this.month = month;
        }
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = Integer.valueOf("Invalid Date");
        } else {
            this.month = month;
        }
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public int difference(CustomDate date) {
        int TotalDays1 = this.year * 365 + this.month * 30 + this.day;
        int TotalDays2 = date.year * 365 + date.month * 30 + date.day;
        return TotalDays1 - TotalDays2;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        int TotalDays1 = date1.year * 365 + date1.month * 30 + date1.day;
        int TotalDays2 = date2.year * 365 + date2.month * 30 + date2.day;
        if (TotalDays1 < TotalDays2) {
            return 1;
        } else if (TotalDays1 > TotalDays2) {
            return -1;
        } else {
            return 0;
        }
    }
    public String  displayFormatted(){
        return this.day+""+this.month+""+this.year;
    }

    public static void main(String[] args) {
        CustomDate customDate=new CustomDate(12,2,3);
        System.out.println(customDate.displayFormatted());
    }
}


