package Week06.EX05;

public class Segment implements Cloneable {
    private Point P1, P2;

    public Segment(Point P1, Point P2) {
        this.P1 = P1;
        this.P2 = P2;
    }

    public Point getP1() {
        return P1;
    }

    public void setP1(Point p1) {
        this.P1 = p1;
    }

    public Point getP2() {
        return P2;
    }

    public void setP2(Point p2) {
        this.P2 = p2;
    }

    public double length() {
        return P1.distance(P2);
    }

    public void translate(float dX, float dY) {
        P1.translate(dX, dY);
        P2.translate(dX, dY);
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Segment))
            return false;
        Segment that = (Segment) obj;
        return this.P1.equals(that.P1) && this.P2.equals(that.P2);
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.P1 = P1.clone();
        clone.P2 = P2.clone();
        return clone;
    }

}