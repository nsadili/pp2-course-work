package pp2.Segment;

import pp2.Point.Point;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2); 
    }

    public void translate(float dX, float dY){
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }
    public float length() {
        return p1.distance(p2);
    }
    
    
    public boolean equals(Segment s){
    float k1=(s.p1.gety()-s.p2.gety())/(s.p1.getx()-s.p2.getx());
    float k2=(this.p1.gety()-this.p2.gety())/(this.p1.getx()-this.p2.getx());
    float b1=s.p1.gety()-k1*s.p1.getx();
    float b2=this.p2.gety()-k2*this.p2.getx();
    if(k1==k2 && b1==b2) return true;
    else return false;
    }

}