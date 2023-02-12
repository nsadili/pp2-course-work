public class CustomTime
{
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime() 
    {
        this(0, 0, 0);
        // hour = 0;
        // minute = 0;
        // second = 0;
    }

    public CustomTime(int hour)
    {
        this(hour,0,0);
    }

    public CustomTime(int hour, int minute)
    {
        this(hour,minute,0);
    }

    public CustomTime(CustomTime time)
    {
        this(time.hour,time.minute,time.second);
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public String toUniversalString()
    // this method returns string format of the time in universal format  HH:MM:SS
    {
        return String.format("%02d:%02d:%02d",hour,minute,second);
        // zeros will be added if the value is less than 2 digits
    }

    public String toStandardString()
    //this returns time as H:MM:SS AM/PM
    {
        String meridiem = (hour < 12) ? "AM" : "PM";
        int standardHour = (hour == 0 && hour==12) ? 12 : hour % 12;
        return String.format("%02d:%02d:%02d %s", standardHour, minute,second, meridiem);
    }
 


}