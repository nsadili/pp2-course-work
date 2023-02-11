public class CustomTime {
    private int h, m, s;

    public CustomTime(int h, int m, int s){
      this.h = h;
      this.m = m;
      this.s = s;
    }
    public CustomTime(){
        this(0, 0, 0);
    }
    public CustomTime(int h){
        this(h, 0, 0);
    }
    public CustomTime(int h, int m){
        this(h, m, 0);
    }
    public CustomTime(CustomTime time){
        this(time.getH(), time.getM(), time.getS());
    }
    public void setH(int h) {
        this.h = h;
    }
    public void setM(int m) {
        this.m = m;
    }
    public void setS(int s) {
        this.s = s;
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
        return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
    }
    public String toStandardString(){
        return String.format("%02d:%02d:%02d %s", h == 0 ? 12 : h, this.m, this.s, (this.h % 24) / 12 == 0 ? "AM" : "PM");
    }
    
}
