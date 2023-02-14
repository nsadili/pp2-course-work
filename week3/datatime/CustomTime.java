package week3.datetime;

public class CustomTime {
    private int second;
    private int minute;
    private int hour;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second<0 || second>59) 
        {
            System.out.println("Invalid Second: " + second);
            System.exit(0);
        }
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<0 || minute>59) 
        {
            System.out.println("Invalid Minute: " + minute);
            System.exit(0);
        }
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<0 || hour>23) 
        {
            System.out.println("Invalid Hour: " + hour);
            System.exit(0);
        }
        this.hour = hour;
    }
    
    public CustomTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public CustomTime() {
        this(0, 0, 0);
    }

    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    public CustomTime(CustomTime time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02", getHour(), getMinute(), getSecond());
    } 

    public String toStandardString() {
        String ampm = (hour < 12) ? "AM" : "PM";
        int hour12;
        if(hour == 0 || hour == 12) hour12 = 12;
        else hour12 = hour%12;
        return String.format("%d:%02d:%02d %s", hour12, getMinute(), getSecond(), ampm);
    }
}
