package pp2.week03.datetime;

public class CustomTime {
    private int Hour; //Hour
    private int Min; //Min
    private int Sec; //Seconds
    
    public CustomTime(int Hour, int Min, int Sec) {
        this.Hour = Hour;
        this.Min = Min;
        this.Sec = Sec;
    }

    public CustomTime(int Hour, int Min) {
        this.Hour = Hour;
        this.Min = Min;
        this.Sec = 0;
    }

    public CustomTime(int Hour) {
        this.Hour = Hour;
        this.Min = 0;
        this.Sec = 0;
    }

    public CustomTime() {
        this.Hour = 0;
        this.Min = 0;
        this.Sec = 0;
    }

    public CustomTime(CustomTime time) {
        this.Hour = time.Hour;
        this.Min = time.Min;
        this.Sec = time.Sec;
    }

    public int Hour() {
        return Hour;
    }

    public int Minute() {
        return Min;
    }

    public int Second() {
        return Sec;
    }

    public void Hour(int Hour) {
        this.Hour = Hour;
    }

    public void Minute(int Min) {
        this.Min = Min;
    }

    public void Second(int Sec) {
        this.Sec = Sec;
    }

    public String String() {
        String Hour = "";
        String Min = "";
        String Sec = "";
        
        if(this.Hour<10) Hour = "0"+ this.Hour;
        else if(this.Hour>=10) Hour = ""+ this.Hour;
        if(this.Min<10) Min = "0"+ this.Min;
        else if(this.Min>=10) Min = ""+ this.Min;
        if(this.Sec<10) Sec = "0"+ this.Sec;
        else if(this.Sec>=10) Sec = ""+ this.Sec;

        return Hour+":"+Min+":"+Sec;
    }

    public String String1() {

        String Hour = "";
        String Min = "";
        String Sec = "";
        String AM_PM = "";

        if(this.Min<10) Min = "0"+ this.Min;
        
        else if(this.Min>=10) Min = ""+ this.Min;
        
        if(this.Sec<10) Sec = "0"+ this.Sec;
        
        else if(this.Sec>=10) Sec = ""+ this.Sec;
        
        if(this.Hour<=12) {
            Hour = ""+ this.Hour;
            AM_PM = "AM";
        }

        else if(this.Hour>12) {
            Hour = ""+ (this.Hour-12);
            AM_PM = "PM";
        }

        return Hour+":"+Min+":"+Sec+" "+AM_PM;
    }
}