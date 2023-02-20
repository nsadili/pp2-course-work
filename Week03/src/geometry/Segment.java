package geometry;
public class Segment {
    private Point p1 = new Point();
    private Point p2 = new Point();

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment(double x1, double y1, double x2, double y2) {
        this.p1.setX(x1);
        this.p1.setY(y1);
        this.p2.setX(x2);
        this.p2.setY(y2);
        
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
    public double length() {
        return p1.distance(p2);
    }
    public boolean equals(Segment s) {
        if(this.p1 == s.p1 && this.p2 == s.p2) {
            return true;
        }
        return false;
    }
    public double getSlope() {
        return (this.p1.getY() - this.p2.getY())/(this.p1.getX() - this.p2.getX());
    }
    public boolean isOnLine(Point p) {
        double m = (this.p1.getY() - this.p2.getY())/(this.p1.getX() - this.p2.getX());
        if(p.getY() == m*(p.getX()-this.p1.getX()) + this.p1.getY()) {
            return true;
        }
        return false;
    }
    public double getIntercept() {
        return this.p1.getY() - this.getSlope()*this.p1.getX(); 
    }



    @Override
    public String toString() {
        return "[" + p1 + "], [" + p2 + "]";
    }

}
