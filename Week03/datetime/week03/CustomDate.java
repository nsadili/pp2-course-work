package pp2.week03.datetime;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
class CustomDate {
    int month;
    int day;
    int year;
    
    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public boolean isleapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
        
    }
    public static void displayDate(int month, int day, int year){
        System.out.println(String.format("%02d/%02d/%04d", month, day, year));
    }
    
    public int difference(CustomDate date)
    {
        LocalDate d1 = LocalDate.of(this.year,this.month, this.day);
        LocalDate d2 = LocalDate.of(date.year, date.month, date.day);
        Period p = Period.between(d1, d2);
        return p.getDays();
    }
    public static int compare(CustomDate date1, CustomDate date2) {
          
        if ((date1.year == date2.year && date1.month == date2.month && date1.day < date2.day) || date1.year == date2.year && date1.month < date2.month || date1.year < date2.year)
        return 1;
        else
        if ((date1.year == date2.year && date1.month == date2.month && date1.day > date2.day) || date1.year == date2.year && date1.month > date2.month || date1.year > date2.year)
        return -1;
        else
        return 0;
    }
    public void displayFormatted(int month, int day, int year)
    {
        System.out.println(day+"."+month+"."+year );
    }




    
}
