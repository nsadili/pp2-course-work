package Week03.ex.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point point, Point point2) {
        this.p1 = point;
        this.p2 = point2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Segment(int i, int j) {
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return p1.equals(s.p2) && p2.equals(s.p2);
    }

    public float getSlope() {
        return ((p2.getY() - p1.getY())/(p2.getX() - p1.getX()));
    }

    public float getIntercept() {
        return p1.getY() - getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

    public boolean isOnSegment(Point p) {
        return false;
        
    }
    
}