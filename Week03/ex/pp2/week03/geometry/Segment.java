package pp2.week03.geometry;

public class Segment {
    Point p1;
    Point p2;

    public Segment(Point p1,Point p2) {
        this.p1=p1;
        this.p2=p2;
    }

    public Segment(float x1,float y1, float x2,float y2) {
        this.p1=new Point(x1,y1);
        this.p2=new Point(x2,y2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p) {
        this.p1=p;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p) {
        this.p2=p;
    }

    public void translate(float dX,float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(p1);
    }

    public boolean equals(Segment s) {
        if(this.p1.equals(s.getP1()) & this.p2.equals(s.getP2())) return true;
        else return false;
    }

    public float getSlope() {
        return (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
    }

    public float getIntercept() {
        return this.p1.getY()-(this.p1.getX()*this.getSlope());
    }

    public boolean IsOnLine(Point p) {
        if(this.p1.distance(this.p2)>this.p1.distance(p)) return true;
        else return false;
    }

    public boolean IsOnSegment(Point p) {
        if(this.IsOnLine(p)==true) return true;
        else return false;
    }
}
