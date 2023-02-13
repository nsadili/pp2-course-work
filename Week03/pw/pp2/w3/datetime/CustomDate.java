package pp2.w3.datetime;
public class CustomDate {
    
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = month > 0 && month < 13 ? month : 1;
        this.year = year > 0 ? year : 1;
        this.day = day <= 31 && day > 0 ? day : 1;
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
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }
    
    public int difference (CustomDate date) {
        int d = 0;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = this.year; i < date.getYear(); i++) {
            if ((i % 4 == 0) && (i % 400 == 0)) {
                d += 366;

            } else 
            d += 365;

        }
        for (int i = 0; i <12 ; i++) {
            if (i<this.month-1 || i > date.month-1) {
                d += monthDays[i];
            }
        }
        d -=this.day;
    
     d +=date.day;
     return d;
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
        String monthName;
        switch (this.month) {
            case 1: monthName = "Jan"; break;
            case 2: monthName = "Feb"; break;
            case 3: monthName = "Mar"; break;
            case 4: monthName = "Apr"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "Jun"; break;
            case 7: monthName = "Jul"; break;
            case 8: monthName = "Aug"; break;
            case 9: monthName = "Sep"; break;
            case 10: monthName = "Oct"; break;
            case 11: monthName = "Nov"; break;
            default: monthName = "Dec"; break;
        }
    System.out.println(this.day + " " + monthName + " " + this.year);
    }
}





