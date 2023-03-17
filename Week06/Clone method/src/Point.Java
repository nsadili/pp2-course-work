public class Point implements Cloneable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}

public class Segment implements Cloneable {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment cloned = (Segment) super.clone();
        cloned.start = start.clone();
        cloned.end = end.clone();
        return cloned;
    }
}