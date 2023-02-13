package datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;
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
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String displayDate() {
        return this.month+"/"+this.day+"/"+this.year;
    }
    public String difference(CustomDate date) {
        int yearDiff = this.year - date.year; 
        int monthDiff = this.month - date.month; 
        int dayDiff = this.day - date.day; 
        if (yearDiff<0) yearDiff = -yearDiff;
        if (monthDiff<0) monthDiff = -monthDiff;
        if (dayDiff<0) dayDiff = -dayDiff;
        int result = yearDiff*365 + monthDiff*30 +dayDiff;
        return result+" days";
    }
    public static int compare(CustomDate date1, CustomDate date2) {
        int result1 = date1.year*365 + date1.month*30 +date1.day;
        int result2 = date2.year*365 + date2.month*30 +date2.day;
        if(result1<result2) {
            return 1;
        } else if(result1>result2) {
            return -1;
        } else {
            return 0;
        }
    }
    public String displayFormatted() {
        String month = "";
        switch(this.month) {
            case 1 : month = "Jan"; break;
            case 2 : month = "Feb"; break;
            case 3 : month = "Mar"; break;
            case 4 : month = "Apr"; break;
            case 5 : month = "May"; break;
            case 6 : month = "Jun"; break;
            case 7 : month = "Jul"; break;
            case 8 : month = "Aug"; break;
            case 9 : month = "Sep"; break;
            case 10 : month = "Oct"; break;
            case 11 : month = "Nov"; break;
            case 12 : month = "Dec"; break;
        }
        return this.day+" "+month+" "+this.year;
    }
    @Override
    public String toString() {
        return "CustomDate [month=" + month + ", day=" + day + ", year=" + year + "]";
    }
    
    
}