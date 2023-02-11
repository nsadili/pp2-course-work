package geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1=p1;
        this.p2=p2;
    }
    public Segment(float x1, float y1, float x2, float y2){
        this.p1=new Point(x1,y1);
        this.p2=new Point(x2,y2);
        
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX,dY);
        this.p2.translate(dX,dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.getP1()) && this.p2.equals(s.getP2());
    }

    public float getSlope() {
        return (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
    }

    public float getIntercept() {
        return this.p1.getY() - this.getSlope() * this.p1.getX();
    }

    public boolean isOnLine(Point p) {
        return this.getSlope() * p.getX() + this.getIntercept() == p.getY();
    }
}
