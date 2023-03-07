package Week06;

public class Segment implements Movable{
    private Point a1;
    private Point a2;

    public Segment(Point a1, Point a2) {
        this.p1 = a1;
        this.p2 = a2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getA1() {
        return this.a1;
    }

    public void setA1(Point a) {
        this.a1 = a;
    }

    public Point getA2() {
        return this.a2;
    }

    public void setA2(Point a) {
        this.a2 = a;
    }

    public void translate(float dX, float dY) {
        this.a1.translate(dX, dY);
        this.a2.translate(dX, dY);
    }

    public float length() {
        return a1.distance(a2);
    }

    public boolean equals(Segment s) {
        return this.getA1().equals(s.getA1()) && this.getA2().equals(s.getA2());
    }

    public float getSlope() {
        return ((this.a2.getY() - this.a1.getY()) / (this.a2.getX() - this.a1.getX()));
    }

    public float getIntercept() {
        return this.a1.getY() - getSlope() * this.a1.getX();
    }

    public boolean isOnLine(Point a) {
        return a.getY() == (getSlope() * a.getX() + getIntercept());
    }

    @Override
    public String toString() {
        return "Segment{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.a1 = (Point) a1.clone();
        clone.a2 = (Point) a2.clone();
        return clone;
    }

    @Override
    public void moveUp() {
        a1.moveUp();
        a2.moveUp();
    }

    @Override
    public void moveDown() {
        a1.moveDown();
        a2.moveDown();
    }

    @Override
    public void moveLeft() {
        a1.moveLeft();
        a2.moveLeft();
    }

    @Override
    public void moveRight() {
        a1.moveRight();
        a2.moveRight();
    }
}