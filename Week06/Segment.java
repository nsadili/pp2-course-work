package Week06;

public class Segment implements Movable {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float x2, float y1, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return p2;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Segment s = (Segment) obj;
        return p1.equals(s.p1) && p2.equals(s.p2);
    }

    public float getSlope() {
        float dx = p2.getX() - p1.getX();
        float dy = p2.getY() - p1.getY();
        return dy / dx;
    }

    public float getIntercept() {
        float m = getSlope();
        return p1.getY() - m * p1.getX();
    }

    public boolean isOnLine(Point p) {
        float expectedY = getSlope() * p.getX() + getIntercept();
        return p.getY() == expectedY;
    }

    public boolean isOnSegment(Point p) {
        float minX = Math.min(p1.getX(), p2.getX());
        float maxX = Math.max(p1.getX(), p2.getX());
        float minY = Math.min(p1.getY(), p2.getY());
        float maxY = Math.max(p1.getY(), p2.getY());
        return isOnLine(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }

    @Override
    public String toString() {
        return "Segment [p1=" + p1 + ", p2=" + p2 + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Segment clonedSegment = (Segment) super.clone();
        clonedSegment.p1 = (Point) p1.clone();
        clonedSegment.p2 = (Point) p2.clone();
        return clonedSegment;
    }

    @Override
    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    @Override
    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    @Override
    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    @Override
    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }
}
