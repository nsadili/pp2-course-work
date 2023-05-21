package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    private void setTime(int hour2, int minute2, int second2) {
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

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Invalid second!");
        }
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardString() {
        String suffix = (hour >= 12) ? "PM" : "AM";
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return String.format("%d:%02d:%02d %s", standardHour, minute, second, suffix);
    }
}