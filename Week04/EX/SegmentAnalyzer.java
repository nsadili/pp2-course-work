import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegmentAnalyzer {
    public static void main(String[] args) {
        Segment[] segments = {new Segment(new Point(1, 2), new Point(3, 4)),
                              new Segment(new Point(5, 6), new Point(7, 8)),
                              new Segment(new Point(9, 10), new Point(11, 12)),
                              new Segment(new Point(13, 14), new Point(15, 16)),
                              new Segment(new Point(17, 18), new Point(19, 20))};

        Segment[] minSegments = findMinLengthSegments(segments);
        System.out.println(Arrays.toString(minSegments));
    }

    public static Segment[] findMinLengthSegments(Segment[] segments) {
        double minLength = Double.MAX_VALUE;
        List<Segment> minSegments = new ArrayList<>();

        for (Segment s : segments) {
            double length = s.getLength();
            if (length < minLength) {
                minLength = length;
                minSegments.clear();
                minSegments.add(s);
            } else if (length == minLength) {
                minSegments.add(s);
            }
        }

        return minSegments.toArray(new Segment[0]);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Segment {
    Point p1;
    Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "Segment(" + p1.x + ", " + p1.y + "), (" + p2.x + ", " + p2.y + ")";
    }
}
