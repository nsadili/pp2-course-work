

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
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, minute, second, hour < 12 ? "AM" : "PM");
    }
}

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(10, 30, 30);
        CustomTime time2 = new CustomTime();
        CustomTime time3 = new CustomTime(10);
        CustomTime time4 = new CustomTime(10, 30);
        CustomTime time5 = new CustomTime(time1);

        System.out.println("Time 1 (Universal): " + time1.toUniversalString());
        System.out.println("Time 1 (Standard): " + time1.toStandardString());
        System.out.println("Time 2 (Universal): " + time2.toUniversalString());
        System.out.println("Time 2 (Standard): " + time2.toStandardString());
        System.out.println("Time 3 (Universal): " + time3.toUniversalString());
        System.out.println("Time 3 (Standard): " + time3.toStandardString());
        System.out.println("Time 4 (Universal): " + time4.toUniversalString());
        System.out.println("Time 4 (Standard): " + time4.toStandardString());
        System.out.println("Time 5 (Universal): " + time5.toUniversalString());
        System.out.println("Time 5 (Standard): " + time5.toStandardString());
    }
}
