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
        this(time.hour, time.minute, time.second);
    }

    public int getHours() {
        return hour;
    }

    public void setHours(int hour) {
        this.hour = hour;
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
    }

    public int getMinutes() {
        return minute;
    }

    public void setMinutes(int minute) {
        this.minute = minute;
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandardString() {
        return String.format("%d:%02d:%02d %s", 
        hour == 0 || hour == 12 ? 12 : hour % 12,
        minute, 
        second,
        hour < 12 ? "AM" : "PM");
  }
}