package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;
    
    // Constructor 1: with three input parameters
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // Constructor 2: no input, initialize members with 0
    public CustomTime() {
        this(0, 0, 0);
    }
    
    // Constructor 3: with one input parameter (hour)
    public CustomTime(int hour) {
        this(hour, 0, 0);
    }
    
    // Constructor 4: with two input parameters (hour, minute)
    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }
    
    // Constructor 5: copy the given CustomTime object
    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }
    
    // Getter methods for each member
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    // Method toUniversalString: returns time in universal format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // Method toStandardString: returns time in standard format (H:MM:SS AM/PM)
    public String toStandardString() {
        return String.format("%d:%02d:%02d %s", 
                (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
                getMinute(), getSecond(), (getHour() < 12) ? "AM" : "PM");
    }
}
