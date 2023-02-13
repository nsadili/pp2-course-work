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
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        this.hour = ((hour >= 0 && hour < 24) ? hour : 0);
    }

    public void setMinute(int minute) {
        this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
    }

    public void setSecond(int second) {
        this.second = ((second >= 0 && second < 60) ? second : 0);
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
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(),
                getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }
}
// the rest part of the code

package pp2.week03.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(15, 30, 45);
        CustomTime time2 = new CustomTime(15);
        CustomTime time3 = new CustomTime(15, 30);
        CustomTime time4 = new CustomTime();
        CustomTime time5 = new CustomTime(time1);

        System.out.println(time1.toUniversalString());
        System.out.println(time1.toStandardString());
        System.out.println(time2.toUniversalString());
        System.out.println(time2.toStandardString());
        System.out.println(time3.toUniversalString());
    }
}