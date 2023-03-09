package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor with three parameters
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor with no parameters
    public CustomTime() {
        this(0, 0, 0);
    }

    // Constructor with one parameter
    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    // Constructor with two parameters
    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor to copy another CustomTime object
    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }

    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Method to return time in universal format
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to return time in standard format
    public String toStandardString() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", standardHour, minute, second, amPm);
    }
}