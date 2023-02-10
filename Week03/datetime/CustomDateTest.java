package Week03.datetime;
import java.text.DateFormatSymbols;

class CustomDate {
    private int month;
    private int day;
    private int year;
    
    public CustomDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        
        boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if ((month == 2) && (leap == true) && (day > 29)) {
            throw new IllegalArgumentException("Invalid day for February in a leap year: " + day);
        } else if ((month == 2) && (leap == false) && (day > 28)) {
            throw new IllegalArgumentException("Invalid day for February in a non-leap year: " + day);
        }
        if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30)) {
            throw new IllegalArgumentException("Invalid day for the month: " + month);
        }
        
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
    
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        int days1 = year * 365 + day;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 2:
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                        days1 += 29;
                    } else {
                        days1 += 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days1 += 30;
                    break;
                default:
                    days1 += 31;
            }
        }
        
        int days2 = date.year * 365 + date.day;
        for (int i = 1; i < date.month; i++) {
            switch (i) {
                case 2:
                    if (((date.year % 4 == 0) && (date.year % 100 != 0)) || (date.year % 400 == 0)) {
                        days2 += 29;
                    } else {
                        days2 += 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days2 += 30;
                    break;
                default:
                    days2 += 31;
            }
        }
        
        return (days2 - days1);
    }
    
    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else if (date1.month < date2.month) {
            return 1;
        } else if (date1.month > date2.month) {
            return -1;
        } else if (date1.day < date2.day) {
            return 1;
        } else if (date1.day > date2.day) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public void displayFormatted() {
        System.out.println(day + " " + new DateFormatSymbols().getMonths()[month-1].substring(0,3) + " " + year);
    }
}


public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 1, 2020);
        CustomDate date2 = new CustomDate(2, 29, 2020);
        CustomDate date3 = new CustomDate(12, 31, 2020);
        
        System.out.println("Date1: ");
        date1.displayDate();
        date1.displayFormatted();
        System.out.println();
        
        System.out.println("Date2: ");
        date2.displayDate();
        date2.displayFormatted();
        System.out.println();
        
        System.out.println("Date3: ");
        date3.displayDate();
        date3.displayFormatted();
        System.out.println();
        
        System.out.println("Difference between date1 and date2: " + date1.difference(date2) + " days");
        System.out.println("Difference between date2 and date3: " + date2.difference(date3) + " days");
        System.out.println("Difference between date3 and date1: " + date3.difference(date1) + " days");
        System.out.println();
        
        System.out.println("Comparison between date1 and date2: " + CustomDate.compare(date1, date2));
        System.out.println("Comparison between date2 and date3: " + CustomDate.compare(date2, date3));
        System.out.println("Comparison between date1 and date3: " + CustomDate.compare(date1, date3));
    }
}
