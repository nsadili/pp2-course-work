package Week05.src.Geometry2;

public class Segment2 {
    Point2 p1;
    Point2 p2;

    public Segment2(Point2 p1, Point2 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment2(float x1, float y1, float x2, float y2) {
        this.p1 = new Point2(x1, y1);
        this.p2 = new Point2(x2, y2);
    }

    public Point2 getP1() {
        return p1;
    }

    public void setP1(Point2 p1) {
        this.p1 = p1;
    }

    public Point2 getP2() {
        return p2;
    }

    public void setP2(Point2 p2) {
        this.p2 = p2;
    }

    public void translate(float dx, float dy) {
        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }

    public float length() {
        return this.p1.distance(this.p2);
    }

    public boolean equals(Segment2 s) {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope() {
        float dx = this.p2.getX() - this.p1.getX();
        float dy = this.p2.getY() - this.p1.getY();

        return dy / dx;
    }

    public float getIntercept() {
        float m = this.getSlope();
        return this.p1.getY() - m * this.p1.getX();
    }

    public boolean isOnline(Point2 p) {
        float m = this.getSlope();
        float b = this.getIntercept();

        return p.getY() == m * p.getX() + b;
    }

    boolean isOnSegment(Point2 p) {
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        return this.isOnline(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}
