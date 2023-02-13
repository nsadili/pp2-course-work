package Week03;

public class CustomDate{
    private int month;
    private int day;
    private int year;
   
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>0&&month<13){
            this.month=month;
        }
        else this.month=0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>0&&day<32){
            this.day=day;
        }
        else this.day=0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0){
            this.year=year;
        }
        else this.year=0;
    }

    public CustomDate(int month, int day, int year){
        this.month=month;
        this.day=day;
        this.year=year;

    }
    public String displayDate(){
        return (this.month+"/"+this.day+"/"+this.year);
    }

}