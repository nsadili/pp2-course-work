package EX.geometry;

public class Segment {
    
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point (x1, y1), new Point (x2, y2));
    }

    public void translate (float dx, float dy) {
        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }

    public float length (Point p1, Point p2) {
        return (float) Math.abs(Math.sqrt(p1.getX() - p2.getX())) + (float) Math.abs(Math.sqrt(p1.getY() - p2.getY()));
    }

    public float getSlope () {
        return (p1.getX() - p2.getX()) / (p1.getY() - p2.getY());
    }

    public float getIntercept () {
        return p1.getY() - getSlope() * p1.getX();
    }

    public boolean isOnLine (Point p) {
        return getSlope()*p.getX() - getIntercept() == p.getY() ? true : false;
    }

    // isOnSegment and equals ???

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

}
