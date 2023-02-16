package pp2.week03.datetime;

public class CustomDate {

    private int month;
    private int day;
    private int year; //we created variables
    
    private static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] MONTH_NAMES = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    //then we wrote months' names and amount of days, so in the future they will not be changed

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;        //
        } else {
            throw new Exception("Invalid date"); 
        }
    }

    //in the construct above, we have considered exception. The exception is based on the written date bu user. We have used throw and new.
    //What do they mean? By writing throw new, we "said" to the program, so if it sees a wrong date, it will create a new class, which will be string - "Invalid date"
     
    public int getMonth() {
        return month;
    } //simple part of code based on returning the value of month


    public void setMonth(int month) {
        if (isValidDate(month, day, year)) {
            this.month = month;
        } else {
            throw new Exception("Invalid month");
        }
    }   //we repeat the constructor from the line 13, based on invalid month

    public int getDay() {
        return day;
    } //simple part of code based on returning the value of day

    public void setDay(int day) {
        if (isValidDate(month, day, year)) {
            this.day = day;
        } else {
            throw new Exception("Invalid day");
        } //we repeat the constructor from the line 13, based on invalid day
    }

    public int getYear() {
        return year;
    } //simple part of code based on returning the value of year

    public void setYear(int year) {
        if (isValidDate(month, day, year)) {
            this.year = year;
        } else {
            throw new Exception("Invalid year");
        } //we repeat the constructor from the line 13, based on invalid year
    }
    
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", month, day, year); 
    } //simple part of code based on displayment of the date

    
    public int difference(CustomDate date) {
        int days1 = countDays(month, day, year);
        int days2 = countDays(date.month, date.day, date.year);
        return Math.abs(days1 - days2); //part of the code, which initialize new values days1 and days2, so later they will be applied to be compared with each other 
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
        } //consideration of all cases in terms of comparison of days1 and days2
    }
    
    public void displayFormatted() {
        String monthName = MONTH_NAMES[month];
        System.out.printf("%02d %s %04d\n", day, monthName, year); //now we added new class, which determine new format of displayment given date
    }
    
    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false; }  //here we consider if user write months in an incorrect quantity
        } 
}