class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second){
        if(hour<=24 && hour>=0){
            this.hour = hour;
        }
        if(minute<=60 && minute>=0){
            this.minute = minute;
        }
        if(second<=60 && second>=0){
            this.second = second;
        }
    }
    public CustomTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public CustomTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toUniversalString(){
        if(hour < 10){
            if(minute < 10){
                if(second < 10){
                    return "0" + hour + ":" + "0" + minute + ":" +"0" + second;
                }
                else{
                    return "0" + hour + ":" + "0" + minute + ":" + second;
                }
            }
            else{
                if(second < 10){
                    return "0" + hour + ":" + minute + ":" + "0" + second;
                }
                else{
                    return "0" + hour + ":" + minute + ":" + second;
                }
            }
        }
        else{
            if(minute < 10){
                if(second < 10){
                    return hour + ":" + "0" + minute + ":" + "0" + second;
                }
                else{
                    return  hour + ":" + "0" + minute + ":" + second;
                }
            }
            else{
                if(second < 10){
                    return hour + ":" + minute + ":" + "0" + second;
                }
                else{
                    return hour + ":" + minute + ":" + second;
                }
            }
        }
        
    } 
    public String toStandardString(){
        if(hour > 12){
            if(minute < 10){
                if(second < 10){
                    return hour + ":" + "0" + minute + ":" + "0" + second + " PM";
                }
                else{
                    return  hour + ":" + "0" + minute + ":" + second + " PM";
                }
            }
            else{
                if(second < 10){
                    return hour + ":" + minute + ":" + "0" + second + " PM";
                }
                else{
                    return hour + ":" + minute + ":" + second + " PM";
                }
            }
        }
        else{
            if(minute < 10){
                if(second < 10){
                    return hour + ":" + "0" + minute + ":" + "0" + second + " AM";
                }
                else{
                    return  hour + ":" + "0" + minute + ":" + second + " AM";
                }
            }
            else{
                if(second < 10){
                    return hour + ":" + minute + ":" + "0" + second + " AM";
                }
                else{
                    return hour + ":" + minute + ":" + second + " AM";
                }
            }
        }
    }
}
