package week04.geometry;

public class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);

    }

    public Point getP1() {
        return p1;
    }

    public void setP1() {
        this.p2 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p1 = p2;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        // checks if seg1 == seg2
        if (p1 == s.p1 && p2 == s.p2)
            return true;
        else
            return false;
    }

    public String toString() {
        return "Segment [p1=" + p1 + ", p2=" + p2 + "]";
    }

    public String toString2() {
        StringBuilder sb = new StringBuilder();
        sb.append("[(");
        sb.append(p1.getX());
        sb.append(",");
        sb.append(p1.getY());
        sb.append("), (");
        sb.append(p2.getX());
        sb.append(",");
        sb.append(p2.getY());
        sb.append(",");
        sb.append(")]");
        return sb.toString();

    }

}