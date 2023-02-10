package CustomTime;

public class CustomTime {
    private int hour,minute,second;

    CustomTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    CustomTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    
    int getHour(){
        return this.hour;
    }
    int getMinute(){
        return this.minute;
    }
    int getSecond(){
        return this.second;
    }

    String toUniversalString(){
        int uHour,uMinute,uSecond;
        uSecond = this.second;
        uMinute = this.minute;
        uHour = this.hour;
        
        uMinute = uSecond/60;
        uSecond = uSecond - uSecond/60;
        uHour = uMinute/60;
        uMinute = uMinute - uMinute/60;
        return String.format("%02d:%02d:%02d",uHour,uMinute,uSecond);
    }

    String toStandartString(){
        int uHour,uMinute,uSecond;
        uSecond = this.second;
        uMinute = this.minute;
        uHour = this.hour;
        
        uMinute = uSecond/60;
        uSecond = uSecond - uSecond/60;
        uHour = uMinute/60;
        uMinute = uMinute - uMinute/60;
        int AmPm = uHour/12;
        uHour = uHour - uHour*12;
        if(AmPm%2==0){
            return String.format("%d:%02d:%02d AM",uHour,uMinute,uSecond);
        }else{
            return String.format("%d:%02d:%02d AM",uHour,uMinute,uSecond);
        }
    }


}
