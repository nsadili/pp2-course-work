package Week03;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
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

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid time!");
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardString() {
        String period;
        int standardHour;

        if (hour == 0 || hour == 12) {
            standardHour = 12;
            period = "AM";
        } else if (hour == 12) {
            standardHour = 12;
            period = "PM";
        } else if (hour > 12) {
            standardHour = hour - 12;
            period = "PM";
        } else {
            standardHour = hour;
            period = "AM";
        }

        return String.format("%d:%02d:%02d %s", standardHour, minute, second, period);
    }
}
