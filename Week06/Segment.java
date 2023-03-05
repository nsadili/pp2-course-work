package Week06;

public class Segment implements Movable {
    protected Point p1;
    protected Point p2;

    public Segment() {
        this(0, 0);
    }

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

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    @Override
    public String toString() {
        return "Segment [p1=" + p1 + ", p2=" + p2 + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment t = (Segment)super.clone();
        t.p1 = (Point) p1.clone();
        t.p2 = (Point) p2.clone();
        return t;
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
}
