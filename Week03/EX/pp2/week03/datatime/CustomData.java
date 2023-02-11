package pp2.week03.datatime;


public class CustomData {
    private int day;
    private int month;
    private int year;
    private final int[] daynum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CustomData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daynum[1] = 29;
        }
        if (day > daynum[month - 1] || day < 1 || month > 12 || month < 1) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("Date: %d/%d/%d", month, day, year);
    }

    public long difference(int day, int month, int year) {
        long sum = 0;
        int dayYear = 365;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daynum[1] = 29;
        }
    
        for (int i = 0; i < month - 1; i++) {
            sum += daynum[i];
        }
    
        for (int i = 1; i < year; i++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                dayYear = 366;
            }
            sum += dayYear;
        }
        sum+=day;
        long thisSum = 0;
        int thisDayYear = 365;
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)) {
            daynum[1] = 29;
        }
    
        for (int i = 0; i < this.month - 1; i++) {
            thisSum += daynum[i];
        }
    
        for (int i = 1; i < this.year; i++) {
            if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)) {
                thisDayYear = 366;
            }
           
            thisSum += thisDayYear;
        }
        thisSum+=this.day;
    
        return thisSum - sum;
    }
public static int compare(CustomData date1, CustomData date2) {
    if(date1.year>date2.year || date1.year==date2.year && date1.month> date2.month ||(date1.year==date2.year && date1.month==date2.month && date1.day>date2.day ))
return -1; else

if(date1.year<date2.year || date1.year==date2.year && date1.month<date2.month ||(date1.year==date2.year && date1.month==date2.month && date1.day<date2.day )) return 1; else return 0;}
public void displayFormatted(){
    String monthname[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    System.out.printf("%d %s %d",getDay(),monthname[getMonth()-1],getYear());
}
}






