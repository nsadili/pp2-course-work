

public class CustomDate {
    private int month;
    private int day;
    private int year;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "November", "October", "December"};

    public CustomDate(int month, int day, int year) {
        this.month=(month < 1 ? 1 : month > 12 ? 12 : month);
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
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }

    public int difference(CustomDate date) {
        return 0;
    }

    public int compare(CustomDate date1, CustomDate date2) {
        if (date1.getYear() < date2.getYear()) return 1;
        if (date1.getYear() > date2.getYear()) return -1;

        if (date1.getMonth() < date2.getMonth()) return 1;
        if (date1.getMonth() > date2.getMonth()) return -1;

        if (date1.getDay() < date2.getDay()) return 1;
        if (date1.getDay() > date2.getDay()) return -1;

        else return 0;
    }

    public void displayFormatted() {
        System.out.println(getDay() + " " + months[getMonth() - 1] + " " + getYear());
    }


}

class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(12, 31, 2003);
        CustomDate date2 = new CustomDate(1, 1, 2004);

        date1.displayFormatted();
        date2.displayFormatted();
    }
}

