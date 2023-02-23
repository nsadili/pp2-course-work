package Week03.GeometryEx;

public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(this.p2);
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

    public boolean isOnSegment(Point p) {
        return this.isOnLine(p)
        && p.getX() >= this.p1.getX()
        && p.getX() <= this.p2.getX()
        && p.getY() >= this.p1.getY()
        && p.getY() <= this.p2.getY();
    }

    public String toString() {
        return String.format("[ %s, %s ]", p1.toString(), p2.toString());
    }
}
