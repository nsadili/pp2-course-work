package pp2.week03.datetime;

public class CustomTime {

    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardString() {
        if (hour >= 0 && hour <= 11) {
            return String.format("%d:%02d:%02d PM", hour, minute, second);
        }
         else {
            int hour2 = hour - 12;
            return String.format("%d:%02d:%02d AM", hour2, minute, second);
        }
    }
}
