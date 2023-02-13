package pp2.week03.datetime;
public class CustomTime{
    private int h;
    private int m;
    private int s;

    public CustomTime(int h, int m, int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }

    public CustomTime(){
        this.h=0;
        this.m=0;
        this.s=0;
    }

    public CustomTime(int h){
        this.h=h;
        this.m=0;
        this.s=0;
    }

    public CustomTime(int h, int m){
        this.h=h;
        this.m=m;
        this.s=0;
    }

    public CustomTime(CustomTime t){
        this.h=t.h;
        this.m=t.m;
        this.s=t.s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public String  toStandardString(){
        if (h>12) return String.format("%02d:%02d:%02d AM", h-12, m, s);
        else return String.format("%02d:%02d:%02d PM", h, m, s);

    }
    
}