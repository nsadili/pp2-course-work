package pp2.week03.geometry;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor with three input parameters
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor with no input parameters
    public CustomTime() {
        this(0, 0, 0);
    }

    // Constructor  (hour)
    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    // Constructor  (hour, minute)
    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor to copy
    
    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }
//Getters
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    // Method to return  (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to return  (H:MM:SS AM/PM)
    public String toStandardString() {
        String result = "";
    
        int displayHour;
        if (hour == 0 || hour == 12) {
            displayHour = 12;
        } else {
            displayHour = hour % 12;
        }
        result += displayHour + ":";
        result += String.format("%02d", minute) + ":";
        result += String.format("%02d", second) + " ";
    
        if (hour < 12) {
            result += "AM";//adding string
        } else {
            result += "PM";//adding string
        }
    
        return result;
    }
}


