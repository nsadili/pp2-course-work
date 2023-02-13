package pp2.week03.datetime;
public class CustomDate{
    private int m;
    private int d;
    private int y;

    public CustomDate (int m, int d, int y){
        if (m>12) {
            System.out.println("Please provide a valid month number");
            System.exit(y);
        }
        if (d>28 && m==2 && (y%4!=0)) {
            System.out.println("Please provide a valid day number");
            System.exit(y);
        }
        if (d>29 && m==2 && (y%4==0)) {
            System.out.println("Please provide a valid day number");
            System.exit(y);
        }
        if (d>30 && (m==4 || m==9 || m==9 || m==11)) {
            System.out.println("Please provide a valid day number");
            System.exit(y);
        }
        if (d>31) {
            System.out.println("Please provide a valid day number");
            System.exit(y);
        }

        
        this.m=m;
        this.d=d;
        this.y=y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String displayDate(){
        return String.format("%02d/%02d/%d", m, d, y);
    }

    public long difference(CustomDate d){
        int sum=0;
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i=this.y; i<d.getY(); i++){
            if (i%4==0) sum+=366;
            else sum+=365;
        }
        
        for (int i=0; i<d.getM()-1; i++){
            sum+=months[i];
        }

        for (int i=0; i<this.m-1; i++){
            sum-=months[i];
        }

        sum+=d.getD();
        sum-=this.d;
        return sum;
    }
    
    public int compare(CustomDate d1, CustomDate d2){
        if ((d1.getY()>d2.getY()) || 
        ((d1.getY()==d2.getY()) && (d1.getM()>d2.getM())) ||
        ((d1.getY()==d2.getY()) && (d1.getM()==d2.getM()) && (d1.getD()>d2.getD()))) return -1;
        else if ((d1.getY()==d2.getY()) && (d1.getM()==d2.getM()) && (d1.getD()==d2.getD())) return 0;
        else return 1;
    }

    public String displayFormatted() {
        if (m==1) return this.d + " Jan " + this.y;
        if (m==2) return this.d + " Feb " + this.y;
        if (m==3) return this.d + " Mar " + this.y;
        if (m==4) return this.d + " Apr " + this.y;
        if (m==5) return this.d + " May " + this.y; 
        if (m==6) return this.d + " Jun " + this.y;
        if (m==7) return this.d + " Jul " + this.y;
        if (m==8) return this.d + " Aug " + this.y;
        if (m==9) return this.d + " Sep " + this.y;
        if (m==10) return this.d + " Oct " + this.y;
        if (m==11) return this.d + " Nov " + this.y; 
        if (m==12) return this.d + " Dec " + this.y;
        return null;
    }
}