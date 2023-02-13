package pp2.week03.datetime;

public class CustomTime {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public CustomTime (int hours, int minutes, int seconds)
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public CustomTime ()
    {
        setHours(0);
        setMinutes(0);
        setSeconds(0);
    }
    public CustomTime (int hours)
    {
        setHours(hours);
        setMinutes(0);
        setSeconds(0);
    }
    public CustomTime (int hours, int minutes)
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(0);
    }
    public CustomTime (CustomTime time)
    {
        CustomTime CustomTime = new CustomTime(getHours(), getMinutes(), getSeconds());
    }
    public String toUniversalString ()
    {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
    public String toStandardString ()
    {
        if (hours>12)
        {
            hours-=12;
            System.out.print("PM");
        }
        else System.out.print("AM");
        return String.format("%d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}
