package Week03.PW_3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CustomDate {
    int year;
    int month;
    int day;
    
    public CustomDate(int day, int month, int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public String displayDate(CustomDate date){
        return String.format("%d/%d/%d", date.day, date.month, date.year);
    }
    public long difference(CustomDate date){
        LocalDate start = LocalDate.of(this.year, this.month, this.day);
        LocalDate end = LocalDate.of(date.year, date.month, date.day);
        return Math.abs(ChronoUnit.DAYS.between(start, end));
    }
    public int compare(CustomDate date1, CustomDate date2){
        LocalDate date01 = LocalDate.of(date1.year, date1.month, date1.day);
        LocalDate date02 = LocalDate.of(date2.year, date2.month, date2.day);
        int result = date01.compareTo(date02);
        if (result == 0) return 0;
        else if (result < 0) return 1;
        return -1;
    }
    public String displayFormatted(CustomDate date){
        String month = "";
        switch (date.month){
            case 1: month = "Jan"; break;
            case 2: month = "Feb"; break;
            case 3: month = "Mar"; break;
            case 4: month = "Apr"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "Avg"; break;
            case 9: month = "Sep"; break;
            case 10: month = "Oct"; break;
            case 11: month = "Nov"; break;
            case 12: month = "Dec"; break;
        }
        return String.format("%s %d %d", month, date.day, date.year);
    }
}