package Week03.ex04_costom_time;

class CustomTime {
    private int second;
    private int minute;
    private int hour;

    public CustomTime (int hour, int minute, int second) {
        this.hour = (hour > 59 && hour < 0) ? 0 : hour;
        this.minute = (minute > 59 && minute < 0) ? 0 : minute;
        this.second = (second > 59 && second < 0) ? 0 : second;
    }

    public CustomTime () {
        this(0, 0, 0);
    }

    public CustomTime (int hour) {
        this (hour, 0, 0);
    }

    public CustomTime (int hour, int minute) {
        this (hour, minute, 0);
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

    public CustomTime(CustomTime time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toStandartString() {
        return String.format("%d:%02d:%02d %s", (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12, 
                                                        getMinute(), getSecond(), (getHour() < 12) ? "AM" : "PM");
    }
}


public class CustomTimeTest {
    public static void main(String[] args) {
    CustomTime time1 = new CustomTime(14, 34, 5);
    CustomTime time2 = new CustomTime();
    CustomTime time3 = new CustomTime(7);
    CustomTime time4 = new CustomTime(13, 40);
    CustomTime time5 = new CustomTime(time1);

    System.out.println("time1: " + time1.toUniversalString());
    System.out.println("time2: " + time2.toUniversalString());
    System.out.println("time3: " + time3.toUniversalString());
    System.out.println("time4: " + time4.toUniversalString());
    System.out.println("time5: " + time5.toUniversalString());

    System.out.println("\nTimes in Standart String:\n");
    System.out.println("time1: " + time1.toStandartString());
    System.out.println("time2: " + time2.toStandartString());
    System.out.println("time3: " + time3.toStandartString());
    System.out.println("time4: " + time4.toStandartString());
    System.out.println("time5: " + time5.toStandartString());
        
    }
}
