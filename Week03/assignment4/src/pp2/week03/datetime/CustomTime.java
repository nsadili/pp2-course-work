package pp2.week03.datetime;

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

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        int stdHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", stdHour, minute, second, amPm);
    }

}