public class Point {
    public static void main(String[] args) {
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

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
        }
        return false;
    }
}

public class Segment {
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

    public String toString() {
        return "[" + start + ", " + end + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Segment) {
            Segment other = (Segment) obj;
            return start.equals(other.start) && end.equals(other.end);
        }
        return false;
    }
}
}