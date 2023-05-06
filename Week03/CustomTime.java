package Week03;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    
    public CustomTime(CustomTime time) {
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
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

    public String toUniversalString(){
        String H = "";
        String M = "";
        String S = "";

        if(this.hour < 10) {
            H += "0";
        }
        if(this.minute < 10){
            M += "0";
        }
        if(this.second < 10){
            S += "0";
        }
        H += this.hour;
        M += this.minute;
        S += this.second;

       return H + ":" + M + ":" + S;

    }

    public String toStandardString() {
        if(this.hour <= 12) {
            return toUniversalString() + " AM";
        }
        else {
            return toUniversalString() + " PM";
        }
    }
}
