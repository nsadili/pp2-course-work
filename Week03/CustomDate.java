public class CustomDate {
    private int month;
    private static int day;
    private int year;
 
    public CustomDate(int month, int day, int year) {
       if (isValidDate(month, day, year)) {
          this.month = month;
          this.day = day;
          this.year = year;
       }
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
 
    public void displayDate() {
       System.out.println(month + "/" + day + "/" + year);
    }
 
    public int difference(CustomDate date) {
        return month;
    
       // calculate difference between current date and input date
    }
 
    public static int compare(CustomDate date1, CustomDate date2) {
        return day;
       // compare two dates and return -1, 0 or 1
    }
 
    public void displayFormatted() {
       // display date in format "12 Jan 2020"
    }
 
    private boolean isValidDate(int month, int day, int year) {
        return false;
       // check if the input date is valid
    }
 }