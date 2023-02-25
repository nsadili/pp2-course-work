package week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;



    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);
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

    public float getSlope() {
        return (this.getP1().getY() - this.getP2().getY()) / (this.getP1().getX() - this.getP2().getX());
    }

    public float getIntercept() {
        return this.getP1().getY() - this.getP1().getX() * this.getSlope();
    }

    public void translate(float dX, float dY) {
        p1.setX(dX + p1.getX());
        p2.setX(dX + p2.getX());
        p1.setY(dY + p1.getY());
        p2.setY(dY + p2.getY());
    }

    public float length() {
        return (float)( Math.sqrt(Math.pow(this.getP1().getX() - this.getP2().getX(), 2) +
                Math.pow(this.getP1().getY() - this.getP2().getY(), 2) ) );
    }

    public boolean equals(Segment s) {
        return (this.getP1().equals(s.getP1()) && this.getP2().equals(s.getP2()));
    }

    public boolean isOnLine(Point p) {
        return p.getY() == (p.getX() * this.getSlope() + this.getIntercept()); // y = k * x + b
    }

    public boolean isOnSegment(Point p) {
        return isOnLine(p) && p.getX() >= this.getP1().getX() && p.getX() <= this.getP2().getX();
    }
}
