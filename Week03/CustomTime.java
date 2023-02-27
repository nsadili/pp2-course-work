package Week03.datetime;

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
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Hour must be 0-23");
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Minute must be 0-59");
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Second must be 0-59");
        }
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
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
            (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
            getMinute(),
            getSecond(),
            getHour() < 12 ? "AM" : "PM");
    }
}
