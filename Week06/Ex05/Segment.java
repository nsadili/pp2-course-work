package Week06.Ex05;
public class Segment implements Cloneable {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getp1() {
        return p1;
    }

    public void setp1(Point p1) {
        this.p1 = p1;
    }

    public Point getp2() {
        return p2;
    }

    public void setp2(Point p2) {
        this.p2 = p2;
    }

    public double length() {
        return p1.distance(p2);
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public boolean equals(Object obj) {
        if(obj==null) return false;
        if (!(obj instanceof Segment)) return false;
        Segment that = (Segment) obj;
        return this.p1.equals(that.p1) && this.p2.equals(that.p2);
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment clone = (Segment) super.clone();
        clone.p1 = p1.clone();
        clone.p2 = p2.clone();
        return clone;
    }

}
