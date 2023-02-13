package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int min;
    private int sec;

    public int getHours() {
        return hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public CustomTime (int hour, int min, int sec)
    {
        setHour(hour);
        setMin(min);
        setSec(sec);
    }
    public CustomTime ()
    {
        setHour(0);
        setMin(0);
        setSec(0);
    }
    public CustomTime (int hour)
    {
        setHour(hour);
        setMin(0);
        setSec(0);
    }
    public CustomTime (int hour, int min)
    {
        setHour(hour);
        setMin(min);
        setSec(0);
    }
    public CustomTime (CustomTime time)
    {
        CustomTime CustomTime = new CustomTime(getHour(), getMin(), getSec());
    }
    public String toUniversalString ()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMin(), getSec());
    }
    public String toStandardString ()
    {
        if (hour>12) {System.out.print("pm ");}
        else System.out.print("am ");
        return String.format("%d:%02d:%02d", getHour(), getMin(), getSec());
    }
}