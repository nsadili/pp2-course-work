public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point other = (Point) obj;
        return x == other.x && y == other.y;
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

    public Object clone() throws CloneNotSupportedException {
        Segment clonedSegment = (Segment) super.clone();
        clonedSegment.start = (Point) start.clone();
        clonedSegment.end = (Point) end.clone();
        return clonedSegment;
    }

    public String toString() {
        return "[" + start.toString() + ", " + end.toString() + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment other = (Segment) obj;
        return start.equals(other.start) && end.equals(other.end);
    }
}

public Object clone() throws CloneNotSupportedException {
    Segment clonedSegment = (Segment) super.clone();
    clonedSegment.start = new Point(start.getX(), start.getY());
    clonedSegment.end = new Point(end.getX(), end.getY());
    return clonedSegment;
}
