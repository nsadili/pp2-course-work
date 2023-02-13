package pp2.week03.datetime;

public class CustomTime {
    private int H; //Hour
    private int M; //Minutes
    private int S; //Seconds
    
    public CustomTime(int H, int M, int S) {
        this.H = H;
        this.M = M;
        this.S = S;
    }

    public CustomTime(int H, int M) {
        this.H = H;
        this.M = M;
        this.S = 0;
    }

    public CustomTime(int H) {
        this.H = H;
        this.M = 0;
        this.S = 0;
    }

    public CustomTime() {
        this.H = 0;
        this.M = 0;
        this.S = 0;
    }

    public CustomTime(CustomTime time) {
        this.H = time.H;
        this.M = time.M;
        this.S = time.S;
    }

    public int Hour() {
        return H;
    }

    public int Minute() {
        return M;
    }

    public int Second() {
        return S;
    }

    public void Hour(int H) {
        this.H = H;
    }

    public void Minute(int M) {
        this.M = M;
    }

    public void Second(int S) {
        this.S = S;
    }

    public String String() {
        String H = "";
        String M = "";
        String S = "";
        
        if(this.H<10) H = "0"+ this.H;
        else if(this.H>=10) H = ""+ this.H;
        if(this.M<10) M = "0"+ this.M;
        else if(this.M>=10) M = ""+ this.M;
        if(this.S<10) S = "0"+ this.S;
        else if(this.S>=10) S = ""+ this.S;

        return H+":"+M+":"+S;
    }

    public String String1() {

        String H = "";
        String M = "";
        String S = "";
        String AM_PM = "";

        if(this.M<10) M = "0"+ this.M;
        
        else if(this.M>=10) M = ""+ this.M;
        
        if(this.S<10) S = "0"+ this.S;
        
        else if(this.S>=10) S = ""+ this.S;
        
        if(this.H<=12) {
            H = ""+ this.H;
            AM_PM = "AM";
        }

        else if(this.H>12) {
            H = ""+ (this.H-12);
            AM_PM = "PM";
        }

        return H+":"+M+":"+S+" "+AM_PM;
    }
}