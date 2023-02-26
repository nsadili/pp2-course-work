package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int min;
    private int sec;

    // Constructors
    public CustomTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public CustomTime(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public CustomTime(int hour){
        this.hour = hour;
        this.min = 0;
        this.sec = 0;
    }

    public CustomTime(int hour, int min){
        this.hour = hour;
        this.min = min;
        this.sec = 0;
    }

    public CustomTime(CustomTime time){
        this.hour = time.getHour();
        this.min = time.getMin();
        this.sec = time.getSec();
    }

    // Get / Set methods
    public int getHour(){
        return hour;
    }
    public void setHout(int hour){
        this.hour = hour;
    }

    public int getMin(){
        return min;
    }
    public void setMin(int min){
        this.min = min;
    } 

    public int getSec(){
        return sec;
    }
    public void setSec(int sec){
        this.sec = sec;
    }



    public String toUniversalString(){
        String H = " ";
        String M = " ";
        String S = " ";

        if(this.hour < 10){
            H += "0";
        }
        if(this.min < 10){
            M += "0";
        }
        if(this.sec < 10){
            S += "0";
        }
        H += this.hour;
        M += this.min;
        S += this.sec;
        return H + ":" + M + ":" + S;
    }

    public String toStandardString(){
        if(this.hour <= 12){
            return toUniversalString() + " AM";
        } 
        else {
            return toUniversalString() + " PM";
        }
    }
}
