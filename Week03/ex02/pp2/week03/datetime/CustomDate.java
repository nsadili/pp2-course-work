package pp2.week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;
    
    // Constructor to initialize instance variables
    public CustomDate(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // Set methods for instance variables
    public void setMonth(int month) {
        if (!isValidDate(month, this.day, this.year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.month = month;
    }
    
    public void setDay(int day) {
        if (!isValidDate(this.month, day, this.year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.day = day;
    }
    
    public void setYear(int year) {
        if (!isValidDate(this.month, this.day, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = year;
    }
    
    // Get methods for instance variables
    public int getMonth() {
        return this.month;
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getYear() {
        return this.year;
    }
    
    // Method to display the date in the format of month/day/year
    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }
    
    // Method to calculate the difference in days between two dates
    public int difference(CustomDate date) {
        int difference = 0;
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check if the current year is a leap year
        if (isLeapYear(this.year)) {
            daysInMonth[2] = 29;
        }
        // Calculate the difference in days
        while (!(this.month == date.getMonth() && this.day == date.getDay() && this.year == date.getYear())) {
            difference++;
            this.day++;
            if (this.day > daysInMonth[this.month]) {
                this.day = 1;
                this.month++;
                if (this.month > 12) {
                    this.month = 1;
                    this.year++;
                    // Check if the current year is a leap year
                    if (isLeapYear(this.year)) {
                        daysInMonth[2] = 29;
                    } else {
                        daysInMonth[2] = 28;
                    }
                }
            }
        }
        return difference;
    }
    
    // Method to compare two dates and return 1 if date1 is earlier, -1 if date2 is earlier, or 0 if they are the same
