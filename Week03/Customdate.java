package pp2.week03.datetime;

import java.util.Scanner;

public class CustomDate {
    private int month;
    private int day;
    private int year;
    private int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
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
       this.month=month;
    }
    public void setDay(int day) {
       this.day=day;
    }
    public void setYear(int year) {
       this.year=year;
    }

   

   
    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > daysInMonth[month]) {
            if (month == 2 && day == 29 && isLeapYear(year)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        int difference = 0;
        CustomDate earlierDate, laterDate;
        if (compare(this, date) == -1) {
            earlierDate = this;
            laterDate = date;
        } else {
            earlierDate = date;
            laterDate = this;
        }
        while (!earlierDate.equals(laterDate)) {
            difference++;
            earlierDate.nextDay();
        }
        return difference;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return -1;
        } else if (date1.year > date2.year) {
            return 1;
        }
    }
}


