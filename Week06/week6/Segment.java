package pp2.week6;

public class Segment implements Cloneable {
    public Point p1;
    public Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
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
        this.p1 = p2;
    }

    public float length() {
        return (float) Math.sqrt(Math.abs(this.p1.x - this.p2.x) * Math.abs(this.p1.x - this.p2.x)
                + Math.abs(this.p1.y - this.p2.y) * Math.abs(this.p1.y - this.p2.y));
    }

    public boolean equals(Segment s) {
        if (this.p1.x == s.p1.x && this.p1.y == s.p1.y && this.p2.x == s.p2.x && this.p2.y == s.p2.y) {
            return true;
        }
        return false;
    }

    public float getSlope() {
        return (this.p2.y - this.p1.y) / (this.p2.x - this.p1.x);
    }

    public float getSlope(Point p1, Point p2) {
        return (p2.y - p1.y) / (p2.x - p1.x);
    }

    public float getIntercept() {
        return this.p1.y - getSlope() * p1.x;
    }

    public boolean isOnLine(Point p) {
        if (getSlope() == getSlope(this.p1, p)) {
            return true;
        }
        return false;
    }

    public boolean isBetween(Point p) {
        return (p.x >= Math.min(this.p1.x, this.p2.x) && p.x <= Math.max(this.p1.x, this.p2.x)
                && p.y <= Math.min(this.p1.y, this.p2.y) && p.y >= Math.max(this.p1.y, this.p2.y));
    }

    public boolean isOnSegment(Point p) {
        if (isOnLine(p) && isBetween(p)) {
            return true;
        }

        return false;
    }

    public void moveUp() {
        this.p1.moveUp();
        this.p2.moveUp();
    }

    public void moveDown() {
        this.p1.moveDown();
        this.p2.moveDown();
    }

    public void moveLeft() {
        this.p1.moveLeft();
        this.p2.moveLeft();
    }

    public void moveRight() {
        this.p1.moveRight();
        this.p2.moveRight();
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Segment segment = (Segment) o;

        if (!p1.equals(segment.p1))
            return false;
        return p2.equals(segment.p2);
    }

    @Override
    protected Segment clone() throws CloneNotSupportedException {
        Segment cloned = (Segment) super.clone();
        cloned.p1 = (Point) this.p1.clone();
        cloned.p2 = (Point) this.p2.clone();
        return cloned;
    }
}
