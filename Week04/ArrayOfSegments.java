import java.util.Arrays;

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
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

    public void translate(float dX, float dY) {
        this.p1.setX(this.p1.getX() + dX);
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
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
        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }
}
public class ArrayOfSegments {
    public static void main(String[] args) {
        ArrayOfSegments sts = new ArrayOfSegments();

        Segment[] segments = new Segment[] { 
                new Segment(3, 4, 5, 7), 
                new Segment(1, 2, 4, 1), 
                new Segment(7, 0, 3, -1), 
                new Segment(4, 1, 1, 2), 
                new Segment(-1, -3, -4, -1) };

        System.out.println(Arrays.toString(segments));
        System.out.println(Arrays.toString(sts.getAllShortestSegments(segments)));
    }

    Segment[] getAllShortestSegments(Segment[] segments) {
        if (segments.length == 0)
            return new Segment[] {};

        Segment shortest = getShortestSegment(segments);
        Segment[] allShortests = new Segment[countSegments(segments, shortest.length())];

        int i = 0;
        for (Segment s : segments)
            if (s.length() == shortest.length())
                allShortests[i++] = s;

        return allShortests;
    }

    int countSegments(Segment[] segments, double length) {
        int i = 0;
        for (Segment s : segments)
            if (s.length() == length)
                i++;
        return i;
    }

    Segment getShortestSegment(Segment[] segments) {
        if (segments.length == 0)
            return null;

        Segment shortest = segments[0];
        for (Segment s : segments) {
            if (s.length() < shortest.length())
                shortest = s;
        }
        return shortest;
    }
    
}
