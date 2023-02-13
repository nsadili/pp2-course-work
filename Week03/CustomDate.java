public class CustomDate{
    private int Month;
    private int Day;
    private int Year;

    public CustomDate(int Month, int Day, int Year){
        this.Month = Month;
        this.Day = Day;
        this.Year = Year;
    }
    public int getMonth(){
        return Month;
    }
    public void setMonth(){
        this.Month = Month;
    }
    public int getDay(){
        return Day;
    }
    public void setDay(){
        this.Day = Day;
    }
    public int getYear(){
        return Year;
    }
    public void setYear(){
        this.Year = Year;
    }
}