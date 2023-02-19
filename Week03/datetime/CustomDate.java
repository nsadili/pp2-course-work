package Week03.datetime;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


    
    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public void setDay(int day) {
        this.day = day;
    }



    public int getDay() {
        return this.day;
    }



    public void setMonth(int month) {
        this.month = month;
    }



    public int getMonth() {
        return this.month;
    }



    public void setYear(int year) {
        this.year = year;
    }



    public int getYear() {
        return this.year;
    }



    public void displayDate() {
        System.out.println(getDay() + " / " + getMonth() + " / " + getYear());
    }



    



    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.getYear() < date2.getYear()) return 1;
        if (date1.getYear() > date2.getYear()) return -1;

        if (date1.getMonth() < date2.getMonth()) return 1;
        if (date1.getMonth() > date2.getMonth()) return -1;

        if (date1.getDay() < date2.getDay()) return 1;
        if (date1.getDay() > date2.getDay()) return -1;

        return 0;
    }

    public void displayFormatted() {
        System.out.println(getDay() + " " + months[getMonth() - 1] + " " + getYear());
    }
}