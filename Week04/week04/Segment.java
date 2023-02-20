package pp2.week04;

public class Segment {
    private geometry.Point p1;
    private geometry.Point p2;
    public Segment (geometry.Point p1, geometry.Point p2)    {
        this.p1=p1;
        this.p2=p2;
    }    public Segment (float x1,float y1, float x2, float y2) {
        this.p1.setX (x1);
        this.p2.setX (x2);
        this.p1.setY (y1);
        this.p2.setY (y2);
    }
    public geometry.Point getP1() {
        return p1;    }
    public void setP1(geometry.Point p1) {
        this.p1 = p1;    }
    public geometry.Point getP2() {
        return p2;    }
    public void setP2(geometry.Point p2) {
        this.p2 = p2;    }
    public float length () {        return p1.distance (p2);
    }    public boolean equals (Segment s)  {
        return this.p1.equals (s.p1) && this.p2.equals (s.p2);    }
    public boolean IsOnLine (geometry.Point p) {
        return this.p1.getX() <= p.getX() && this.p2.getX() >= p.getX() && this.p1.getY() <= p.getY() && this.p2.getY() >= p.getY();
    }
    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
    public Segment[] minSegment(Segment arr[]){
        double min=Double.MAX_VALUE;

        int cnt=0,i=0;
        geometry.Point p1=new geometry.Point() ,p2=new geometry.Point();
        for(Segment s:arr){
            if(s.length()<min) {
                min = s.length();
                p1=s.getP1();
                p2=s.getP2();
            }
        }
        for(Segment s:arr){
            if(min==s.length())cnt++;
        }
        Segment res[]=new Segment[cnt];
        for(Segment s:arr){
            if(min==s.length())cnt++;
        }
        for(Segment s:arr){
            if(min==s.length()) {
                res[i].setP1(p1);
                res[i].setP2(p2);
                i++;
            }
        }
        return res;
    }

}
