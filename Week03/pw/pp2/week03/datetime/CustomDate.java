package pp2.week03.datetime;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int day, int month, int year) {

        if (month >= 1 && month <= 12) this.month = month;
        if (day >= 1 && day <= 31) this.day = day;
        if (year >= 1) this.year = year;
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

        int dif = (date.year - year) * 365 + (date.month - month) * 30 + (date.day - day);
        return Math.abs(dif);
    }


    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else {
            if (date1.month < date2.month) {
                return 1;
            } else if (date1.month > date2.month) {
                return -1;
            } else {
                if (date1.day < date2.day) {
                    return 1;
                } else if (date1.day > date2.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public void displayFormatted() {
        switch (month) {
            case 1:
            System.out.println(day + "Jan" + year);
                break;
            case 2:
            System.out.println(day + "Feb" + year);
                break;
            case 3:
            System.out.println(day + "Mar" + year);
                break;
            case 4:
            System.out.println(day + "Apr" + year);
                break;
            case 5:
            System.out.println(day + "May" + year);
                break;
            case 6:
            System.out.println(day + "June" + year);
                break;
            case 7:
            System.out.println(day + "July" + year);
                break;
            case 8:
            System.out.println(day + "Aug" + year);
                break;
            case 9:
            System.out.println(day + "Sep" + year);
                break;
            case 10:
            System.out.println(day + "Oct" + year);
                break;
            case 11:
            System.out.println(day + "Nov" + year);
                break;
            case 12:
            System.out.println(day + "Dec" + year);
        }
    }
}