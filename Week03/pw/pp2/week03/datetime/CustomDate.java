


public class CustomDate {
    private int month;
    private int day;
    private int year;

    public  CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
     public void setDay(int day) {
        this.day = day;
     }
     public int getMonth() {
        return month;
     }
     public void setMonth(int month) {
        this.month = month;
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
        int conversion = (date.year - year) * 365 + (date.month - month) * 31 + (date.day - day);
        return Math.abs(conversion);
    }
    public static int compare(CustomDate date1, CustomDate date2) {

        if ((date1.year == date2.year && date1.month == date2.month && date1.day < date2.day)
                || date1.year == date2.year && date1.month < date2.month || date1.year < date2.year)
            return 1;
        else if ((date1.year == date2.year && date1.month == date2.month && date1.day > date2.day)
                || date1.year == date2.year && date1.month > date2.month || date1.year > date2.year)
            return -1;
        else
            return 0;
    }
    public void displayFormatted() {
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        System.out.println(day + " " + monthNames[month - 1] + " " + year);
    }
}