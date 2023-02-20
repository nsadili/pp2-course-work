package ArraysOfObjects.ex17;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1; this.p2 = p2;
    }

    public Segment(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public double getLength() {
        return p1.distance(p2);
    }
}
