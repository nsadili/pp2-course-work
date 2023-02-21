/**
 * @author Nuraddin Sh. Sadili
 */
public class Segment {
    // TODO: fields
    private Point p1;
    private Point p2;

    // TODO: constructors
    public Segment(Point p1, Point p2) {
        // some treatment to p1 and p2 before you save it to fields
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
        // this.p1 = new Point(x1, y1);
        // this.p2 = new Point(x2, y2);
    }

    // TODO: accessor/modifiers [a.k.a. getter/setters]
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

    // TODO: other methods
    public void translate(float dX, float dY) {
        // this.p1.setX(this.p1.getX() + dX);
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY); // method delegation
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        // this
        // s

        return p1.equals(s.p1) && p2.equals(s.p2);
    }

    public float getSlope() {
        return (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
    }

    public float getIntercept() {
        float slope = getSlope();

        return p1.getY() - slope * p1.getX();
    }

    public boolean isOnLine(Point p) {
        // y = k*x + b

        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }
}
