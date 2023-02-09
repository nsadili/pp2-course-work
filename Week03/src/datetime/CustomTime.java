package datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;
    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public CustomTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public CustomTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public CustomTime(CustomTime time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
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
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public String toUniversalString() {
        String hour = "";
        String minute = "";
        String second = "";
        
        if(this.hour<10) hour = "0"+ this.hour;
        else if(this.hour>=10) hour = ""+ this.hour;
        if(this.minute<10) minute = "0"+ this.minute;
        else if(this.minute>=10) minute = ""+ this.minute;
        if(this.second<10) second = "0"+ this.second;
        else if(this.second>=10) second = ""+ this.second;

        return hour+":"+minute+":"+second;
    }

    public String toStandardString() {
        String hour = "";
        String minute = "";
        String second = "";
        String amPm = "";
        if(this.minute<10) minute = "0"+ this.minute;
        else if(this.minute>=10) minute = ""+ this.minute;
        if(this.second<10) second = "0"+ this.second;
        else if(this.second>=10) second = ""+ this.second;
        if(this.hour<=12) {
            hour = ""+ this.hour;
            amPm = "AM";
        }
        else if(this.hour>12) {
            hour = ""+ (this.hour-12);
            amPm = "PM";
        }
        return hour+":"+minute+":"+second+" "+amPm;
    }
}
