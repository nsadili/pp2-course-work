

public class Segment implements Cloneable, Moveable{
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public String toString() {
        return "point 1: "+ this.p1 + ", point 2: "+ this.p2;
    }

    public boolean equals(Segment s){
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment sCopy = (Segment) super.clone();
        sCopy.p1 = (Point) this.p1.clone();
        sCopy.p2 = (Point) this.p2.clone(); // It is deep cloning since we also cloned the objects inside the object.
        return sCopy;
    }

    @Override
    public void moveUp(int n) {
        p1.moveUp(n);
        p2.moveUp(n);
    }

    @Override
    public void moveDown(int n) {
        p1.moveDown(n);
        p2.moveDown(n);
    }

    @Override
    public void moveLeft(int n) {
        p1.moveLeft(n);
        p2.moveLeft(n);
    }

    @Override
    public void moveRight(int n) {
        p1.moveRight(n);
        p2.moveRight(n);
    }
}
