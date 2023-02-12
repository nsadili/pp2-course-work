public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor that initializes the three instance variables with the given input parameters
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor that initializes all instance variables to 0
    public CustomTime() {
        this(0, 0, 0);
    }

    // Constructor that initializes the hour and sets minute and second to 0
    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    // Constructor that initializes the hour and minute and sets second to 0
    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor that creates a new CustomTime object and copies the values from the given CustomTime object
    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }

    // Getter method for hour
    public int getHour() {
        return hour;
    }

    // Getter method for minute
    public int getMinute() {
        return minute;
    }

    // Getter method for second
    public int getSecond() {
        return second;
    }

    // Method that returns a string representing the time in universal format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method that returns a string representing the time in standard format (H:MM:SS AM/PM)
    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute,
                second,
                (hour < 12) ? "AM" : "PM");
    }
}

class CustomTimeTest {
    public static void main(String[] args) {
        // Test the constructor with three parameters
        CustomTime time1 = new CustomTime(10, 30, 15);
        System.out.println("Time1 (10:30:15): " + time1.toStandardString());

        // Test the constructor with no parameters
        CustomTime time2 = new CustomTime();
        System.out.println("Time2 (0:0:0): " + time2.toStandardString());

        // Test the constructor with one parameter
        CustomTime time3 = new CustomTime(15);
        System.out.println("Time3 (15:0:0): " + time3.toStandardString());

        // Test the constructor with two parameters
        CustomTime time4 = new CustomTime(12, 45);
        System.out.println("Time4 (12:45:0): " + time4.toStandardString());

        // Test the copy constructor
        CustomTime time5 = new CustomTime(time1);
        System.out.println("Time5 (copy of Time1): " + time5.toStandardString());

        // Test the getter methods
        System.out.println("Hour of Time1: " + time1.getHour());
        System.out.println("Minute of Time1: " + time1.getMinute());
        System.out.println("Second of Time1: " + time1.getSecond());

        // Test the toUniversalString method
        System.out.println("Time1 in Universal format: " + time1.toUniversalString());

        // Test the toStandardString method
        System.out.println("Time1 in Standard format: " + time1.toStandardString());
    }
}
