package Week06;

public class Segment implements Movable{
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
        return this.getP1().equals(s.getP1()) && this.getP2().equals(s.getP2());
    }

    public float getSlope() {
        return ((this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX()));
    }

    public float getIntercept() {
        return this.p1.getY() - getSlope() * this.p1.getX();
    }

    public boolean isOnLine(Point p) {
        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.p1 = (Point) p1.clone();
        clone.p2 = (Point) p2.clone();
        return clone;
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

    @Override
    public Movable moveUp(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveUp'");
    }

    @Override
    public Movable moveDown(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveDown'");
    }

    @Override
    public Movable moveLeft(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public Movable moveRight(int steps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }
}