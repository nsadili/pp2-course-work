package Week03.ex.geometry;

import Week06.Movable;

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
        return p1.equals(s.p2) && p2.equals(s.p2);
    }

    public float getSlope() {
        return ((p2.getY() - p1.getY())/(p2.getX() - p1.getX()));
    }

    public float getIntercept() {
        float slope = getSlope();

        return p1.getY() - slope * p1.getX();
    }


    public boolean isOnLine(Point p) {
        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

    @Override
    public String toString() {
        return "["+p1.toString()+","+ p2.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        if (!(obj instanceof Segment)) return false;

        Segment that = (Segment) obj;

        return this.p1.equals(that.p1) && this.p2.equals(p2);
    }

    @Override
    public Movable moveUp(int steps) {
        this.p1.moveUp(steps);
        this.p2.moveUp(steps);
        return this;
    }

    @Override
    public Movable moveDown(int steps) {
        this.p1.moveDown(steps);
        this.p2.moveDown(steps);
        return this;
    }

    @Override
    public Movable moveLeft(int steps) {
        this.p1.moveLeft(steps);
        this.p2.moveLeft(steps);
        return this;
    }

    @Override
    public Movable moveRight(int steps) {
        this.p1.moveRight(steps);
        this.p2.moveRight(steps);
        return this;
    }
}

