package pp23.week03.customtime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

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

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toStandardString() {
        int hour = getHour() % 12;
        String meridian = getHour() < 12 ? "AM" : "PM";
        if (hour == 0) {
            hour = 12;
        }
        return String.format("%d:%02d:%02d %s", hour, getMinute(), getSecond(), meridian);
    }
}
